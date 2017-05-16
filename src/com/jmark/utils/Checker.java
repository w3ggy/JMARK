package com.jmark.utils;

import com.jmark.Application;
import com.jmark.constants.SwingTypes;
import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.ComponentFinder;
import org.fest.swing.core.Robot;
import org.fest.swing.exception.ComponentLookupException;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Checker implements Runnable {

    private Robot robot;
    private ComponentFinder finder;
    private List<TestItem> testItems;
    private int resultEstimate;
    private int currentEstimate;

    public Checker(List<TestItem> testItems) {
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        finder = robot.finder();
        this.testItems = testItems;
    }


    @Override
    public void run() {
        System.out.println("STARTING CHECKING");
        System.out.println("=======================================");
        long startCheckingTime = System.currentTimeMillis();
        for (int i = 0; i < testItems.size(); i++) {
            CaptionMatcher matcher = new CaptionMatcher(testItems.get(i).getName(), testItems.get(i).getComponent());
            test(matcher, testItems.get(i));
        }
        long endTime = System.currentTimeMillis();
        System.out.println(String.format("Checking task time is %d", endTime - startCheckingTime));
        System.out.println("=======================================");
        afterChecking();
    }

    private void test(CaptionMatcher matcher, TestItem testItem) {
        Component tmp;
        try {
            resultEstimate += SwingTypes.getMark(testItem.getComponent());
            tmp = finder.find(matcher);
            robot.click(tmp);
        } catch (ComponentLookupException e) {
            System.out.println("Test № " + testItem.getTestID());
            System.out.println("false");
            System.out.println("There isn't component with this name: " + testItem.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void afterChecking() {
        System.out.println();
        System.out.println("Итоговая оценка: " +
                currentEstimate + " / " + resultEstimate +
                "\n" + 100 * currentEstimate / resultEstimate + "%");
    }
}
