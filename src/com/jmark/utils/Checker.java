package com.jmark.utils;

import com.jmark.constants.SwingTypes;
import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.ComponentFinder;
import org.fest.swing.core.Robot;
import org.fest.swing.exception.ComponentLookupException;

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
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < testItems.size(); i++) {
            CaptionMatcher matcher = new CaptionMatcher(testItems.get(i).getName(), testItems.get(i).getComponent());
            test(matcher, testItems.get(i));
        }
        System.out.println("=======================================");
        afterChecking();
    }

    private void test(CaptionMatcher matcher, TestItem testItem) {
        Component tmp;
        try {
            resultEstimate += SwingTypes.getMark(testItem.getComponent());
            tmp = finder.find(matcher);

            final Component foundComponent = tmp;
            //robot.moveMouse(tmp);
            //robot.click(tmp);
//            robot.enterText("Do you know it?");
//            robot.waitForIdle();
            currentEstimate += ActionWithComponent.actionWithComponent(robot, foundComponent, testItem);


                        /*switch (((JComboBox)list.get(index).getComponent(1)).getSelectedItem().toString()) {
                            case "SetText":
                                ((JButton)foundComponent).setText(((JTextField)list.get(index).getComponent(3)).getText());
                                break;

                            case "Click":
                                //robot.moveMouse(btn);
                                ((JButton)foundComponent).doClick();
                                break;

                        }*/
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
