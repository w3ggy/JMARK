package com.jmark.utils;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class ActionWithComponent {
    static List<JPanel> list = new ArrayList<>();
    static int index = 0;
    public static void actionWithComponent(Component component, TestItem testItem) {

        if (component instanceof JButton) {
            switch (((JComboBox)list.get(index).getComponent(1)).getSelectedItem().toString()) {
                case "Click":
                    ((JButton)component).doClick();
                    break;
                case "Enable":
                    if((((JTextField)list.get(index).getComponent(3)).getText().compareToIgnoreCase("true") == 0 && ((JButton)component).isEnabled() == true) || (((JTextField)list.get(index).getComponent(3)).getText().compareToIgnoreCase("false") == 0 && ((JButton)component).isEnabled() == false)) {
                        // правда
                        System.out.println("Правда");
//                            makeLabel(((JTextField)list.get(index).getComponent(2)).getText() + " : " + ((JTextField)list.get(index).getComponent(3)).getText(), true);
                    } else {
                        // неправда
                        System.out.println("Неравда");
                    }
                    break;
                case "Visible":
                    if((((JTextField)list.get(index).getComponent(3)).getText().compareToIgnoreCase("true") == 0 && ((JButton)component).isVisible() == true) || (((JTextField)list.get(index).getComponent(3)).getText().compareToIgnoreCase("false") == 0 && ((JButton)component).isVisible() == false)) {
                        // правда
                        System.out.println("Правда");
                    } else {
                        // неправда
                    }
                    break;
                case "Background":
                    StringBuffer tmp = new StringBuffer(((JTextField)list.get(index).getComponent(3)).getText());
                    if(tmp.charAt(0) == '#')
                        tmp.deleteCharAt(0);
                    int r = Integer.parseInt(tmp.substring(0,2), 16);
                    int g = Integer.parseInt(tmp.substring(2,4), 16);
                    int b = Integer.parseInt(tmp.substring(4,6), 16);
                    if(((JButton)component).getBackground().equals(new Color(r, g, b))) {
                        //правда
                        System.out.println("Правда");
                    }   else {
                        //неправда
                        System.out.println("Неправда");
                    }
                    break;
                case "Text":
                    if(((JButton)component).getText().compareToIgnoreCase(((JTextField)list.get(index).getComponent(3)).getText()) == 0) {
                        // правда
                        System.out.println("Правда");
                    } else {
                        // неправда
                    }
                    break;
                case "Font":
                    if(((JButton)component).getFont().getName().compareToIgnoreCase(((JTextField)list.get(index).getComponent(3)).getText()) == 0) {
                        // правда
                        System.out.println("Правда");
                    } else {
                        // неправда
                    }

                    break;
            }
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
}
