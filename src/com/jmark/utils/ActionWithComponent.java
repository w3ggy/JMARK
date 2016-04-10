package com.jmark.utils;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class ActionWithComponent {
    public static void actionWithComponent(Component component, TestItem testItem) {

        if (component instanceof JButton) {
            actionWithButton((JButton) component, testItem);
        }



        /*case "JButton":

                break;
            case "JRadioButton":
                break;
            case "JCheckBox":
                break;
            case "JLabel":
                break;
            case "JTextField":
                break;

            case "JPasswordField":
                break;
            case "JFormnattedTextField":
                break;
            case "JTextArea":
                break;
            case "JTextPane":
                break;
            case "JEditorPane":
                break;
            case "JComboBox":
                break;
            case "JTable":
                break;
            case "JList":
                break;
            case "JTree":
                break;
            case "JTabbedPane":
                break;
            case "JSplitPane":
                break;
            case "JSpinner":
                break;
            case "JSlider":
                break;
            case "JSeparator":
                break;
            case "JProgressBar":
                break;
            case "JToolBar":
                break;
            case "JScrollBar":
                break;
*/


    }

    public static void actionWithButton(JButton component, TestItem testItem) {
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                component.doClick();
                break;
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() == true ||
                        testItem.getValue().equalsIgnoreCase("false") && component.isEnabled() == false) {
                    System.out.print(" true");
                } else {
                    System.out.print(" false");
                }
                break;
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() == true ||
                        testItem.getValue().equalsIgnoreCase("false") && component.isVisible() == false) {
                    System.out.print(" true");
                } else {
                    System.out.print(" false");
                }
                break;
            case "Background":
                System.out.println("Test № " + testItem.getTestID());
                StringBuffer tmp = new StringBuffer(testItem.getValue());
                if (tmp.charAt(0) == '#')
                    tmp.deleteCharAt(0);
                if (component.getBackground().equals(new Color(Integer.parseInt(tmp.substring(0, 2), 16),
                        Integer.parseInt(tmp.substring(2, 4), 16),
                        Integer.parseInt(tmp.substring(4, 6), 16)))) {
                    System.out.print(" true");
                } else {
                    System.out.print(" false");
                }
                break;
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.print(" true");
                } else {
                    System.out.print(" false");
                }
                break;
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.print(" true");
                } else {
                    System.out.print(" false");
                }
                break;
        }
    }

}
