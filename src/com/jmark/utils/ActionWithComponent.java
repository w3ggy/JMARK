package com.jmark.utils;

import com.jmark.constants.SwingTypes;
import org.fest.swing.core.Robot;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Artyom on 08.04.2016.
 */
public class ActionWithComponent {

    static Robot actionRobot;

    public static int actionWithComponent(Robot robot, Component component, TestItem testItem) {
        actionRobot = robot;
        if (component instanceof JButton) {
            return actionWithButton((JButton) component, testItem);
        } else if (component instanceof JRadioButton) {
            return actionWithRadioButton((JRadioButton) component, testItem);
        } else if (component instanceof JCheckBox) {
            return actionWithCheckbox((JCheckBox) component, testItem);
        } else if (component instanceof JLabel) {
            return actionWithLabel((JLabel) component, testItem);
        } else if (component instanceof JTextField) {
            return actionWithTextField((JTextField) component, testItem);
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

        return 0;
    }

    private static Color getColor(TestItem testItem) {
        Color temp;
        StringBuffer tmp = new StringBuffer(testItem.getValue());
        if (tmp.charAt(0) == '#')
            tmp.deleteCharAt(0);
        temp = new Color(Integer.parseInt(tmp.substring(0, 2), 16),
                Integer.parseInt(tmp.substring(2, 4), 16),
                Integer.parseInt(tmp.substring(4, 6), 16));
        return temp;
    }

    public static int actionWithButton(JButton component, TestItem testItem) {
        Color background;
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                component.doClick();
                return SwingTypes.getMark(testItem.getComponent());
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isEnabled()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isVisible()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Background":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getBackground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
        }
        return 0;
    }

    public static int actionWithRadioButton(JRadioButton component, TestItem testItem) {
        Color background;
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                component.doClick();
                return SwingTypes.getMark(testItem.getComponent());
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isEnabled()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isVisible()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Background":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getBackground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Foreground":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getForeground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
        }
        return 0;
    }

    public static int actionWithCheckbox(JCheckBox component, TestItem testItem) {
        Color background;
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                component.doClick();
                return SwingTypes.getMark(testItem.getComponent());
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isEnabled()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isVisible()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Background":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getBackground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Foreground":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getForeground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
        }
        return 0;
    }

    public static int actionWithLabel(JLabel component, TestItem testItem) {
        Color background;
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                actionRobot.click(component);
                return SwingTypes.getMark(testItem.getComponent());
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isEnabled()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isVisible()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
        }
        return 0;
    }

    public static int actionWithTextField(JTextField component, TestItem testItem) {
        Color background;
        switch (testItem.getType()) {
            case "Click":
                System.out.println("Test № " + testItem.getTestID());
                System.out.println("Clicked!");
                actionRobot.click(component);
                return SwingTypes.getMark(testItem.getComponent());
            case "Enable":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isEnabled() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isEnabled()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Visible":
                System.out.println("Test № " + testItem.getTestID());
                if (testItem.getValue().equalsIgnoreCase("true") && component.isVisible() ||
                        testItem.getValue().equalsIgnoreCase("false") && !component.isVisible()) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Background":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getBackground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Text":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getText().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Font":
                System.out.println("Test № " + testItem.getTestID());
                if (component.getFont().getName().compareToIgnoreCase(testItem.getValue()) == 0) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
            case "Foreground":
                System.out.println("Test № " + testItem.getTestID());
                background = getColor(testItem);
                if (component.getForeground().equals(background)) {
                    System.out.println("true");
                    return SwingTypes.getMark(testItem.getComponent());
                } else {
                    System.out.println("false");
                    return 0;
                }
        }
        return 0;
    }

}
