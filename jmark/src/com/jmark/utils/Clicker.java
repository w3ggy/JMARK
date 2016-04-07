package com.jmark.utils;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Clicker {
    private void click(CaptionMatcher matcher) throws Exception {
        Component tmp = null;
        long start = System.currentTimeMillis();

        while (tmp == null) {
            try {
                tmp = finder.find(matcher);

                final Component foundComponent = tmp;
//                        robot.moveMouse(btn);
//                        robot.doubleClick(btn);
//                        robot.enterText("Do you know it?");
//                        robot.waitForIdle();
                actionWithComponent(foundComponent, ((JComboBox) list.get(index).getComponent(0)).getSelectedItem().toString());


                        /*switch (((JComboBox)list.get(index).getComponent(1)).getSelectedItem().toString()) {
                            case "SetText":
                                ((JButton)foundComponent).setText(((JTextField)list.get(index).getComponent(3)).getText());
                                break;

                            case "Click":
                                //robot.moveMouse(btn);
                                ((JButton)foundComponent).doClick();
                                break;

                        }*/


                //((JButton)btn).doClick();
                //ActionListener[] AL = ((JTextField)btn).getActionListeners();
                System.out.print("\n");
                //System.out.print((AL[0]).toString());
                System.out.print("\n");
                //((JButton)btn).setText("333");
                System.out.print("\n");


            } catch (Exception e) {
                //e.printStackTrace();
            }
        }
    }
}
