package com.jmark.utils;

import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.ComponentFinder;
import org.fest.swing.core.Robot;

import java.awt.*;
import java.io.File;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Checker implements Runnable{

    private Robot robot;
    private ComponentFinder finder;
    private List<TestItem> testItems;

    public Checker(List<TestItem> testItems) {
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        finder = robot.finder();
        this.testItems = testItems;
    }


    @Override
    public void run() {
        for(int i = 0; i < testItems.size(); i++) {
            CaptionMatcher matcher = new CaptionMatcher(testItems.get(i).getName(), testItems.get(i).getComponent());
            test(matcher, testItems.get(i));
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void test(CaptionMatcher matcher, TestItem testItem) {
        Component tmp = null;
        long start = System.currentTimeMillis();

        while (tmp == null) {
            try {
                tmp = finder.find(matcher);

                final Component foundComponent = tmp;
                        robot.moveMouse(tmp);
                        robot.click(tmp);
//                        robot.enterText("Do you know it?");
//                        robot.waitForIdle();
                ActionWithComponent.actionWithComponent(foundComponent, testItem);


                        /*switch (((JComboBox)list.get(index).getComponent(1)).getSelectedItem().toString()) {
                            case "SetText":
                                ((JButton)foundComponent).setText(((JTextField)list.get(index).getComponent(3)).getText());
                                break;

                            case "Click":
                                //robot.moveMouse(btn);
                                ((JButton)foundComponent).doClick();
                                break;

                        }*/

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
