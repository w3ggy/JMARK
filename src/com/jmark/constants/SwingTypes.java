package com.jmark.constants;

import java.util.Arrays;

/**
 * Created by Artyom on 10.04.2016.
 */
public class SwingTypes {

    public static final int JBUTTON = 0;
    public static final int JRADIOBUTTON = 1;
    public static final int JCHECKBOX = 2;
    public static final int JLABEL = 3;
    public static final int JTEXTFIELD = 4;
    public static final int JPASSWORDFIELD = 5;
    public static final int JFORMATTEDTEXTFIELD = 6;
    public static final int JTEXTAREA = 7;
    public static final int JTEXTPANE = 8;
    public static final int JEDITORPANE = 9;
    public static final int JTABLE = 10;
    public static final int JLIST = 11;
    public static final int JTREE = 12;
    public static final int JTABBEDPANE = 13;
    public static final int JSPITPANE = 14;
    public static final int JSPINNER = 15;
    public static final int JSLIDER = 16;
    public static final int JSEPARATOR = 17;
    public static final int JPROGRESSBAR = 18;
    public static final int JTOOLBAR = 19;
    public static final int JSCROLLPANE = 20;
    public static final int JSCROLLBAR = 21;

    private static String[] returnActions(int type) {
        switch (type) {
            case JBUTTON: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action"};
            }
            case JRADIOBUTTON: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JCHECKBOX: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JLABEL: {
                return new String[]{"Click", "Enable", "Visible", "Text", "Font", "Action"};
            }
            case JTEXTFIELD: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JPASSWORDFIELD: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JFORMATTEDTEXTFIELD: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JTEXTAREA: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JTEXTPANE: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JEDITORPANE: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JTABLE: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JLIST: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JTREE: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font", "Action", "Foreground"};
            }
            case JTABBEDPANE: {
                return new String[]{"Click", "Enable", "Visible", "Text", "Font", "Action"};
            }
            case JSPITPANE: {
                return new String[]{"Find", "Enable", "Visible"};
            }
            case JSPINNER: {
                return new String[]{"Find", "Enable", "Visible", "Font", "Action"};
            }
            case JSLIDER: {
                return new String[]{"Find", "Enable", "Visible", "Font", "Action"};
            }
            case JSEPARATOR: {
                return new String[]{"Find", "Enable", "Visible"};
            }
            case JPROGRESSBAR: {
                return new String[]{"Find", "Enable", "Visible", "Text", "Font", "Action", "Foreground"};
            }
            case JTOOLBAR: {
                return new String[]{"Click", "Enable", "Visible", "Background", "Text", "Font"};
            }
            case JSCROLLPANE: {
                return new String[]{"Find"};
            }
            case JSCROLLBAR: {
                return new String[]{"Find", "Enable", "Visible", "Background", "Text", "Font", "Action"};
            }
        }
        return new String[0];
    }

    private static String[] swingTypes = {
            "JButton",
            "JRadioButton",
            "JCheckBox",
            "JLabel",
            "JTextField",
            "JPasswordField",
            "JFormattedTextField",
            "JTextArea",
            "JTextPane",
            "JEditorPane",
            "JComboBox",
            "JTable",
            "JList",
            "JTree",
            "JTabbedPane",
            "JSplitPane",
            "JSpinner",
            "JSlider",
            "JSeparator",
            "JProgressBar",
            "JToolBar",
            "JScrollBar",
            "JScrollPane"};

    public static boolean containsType(String type) {
        for (String temp : swingTypes) {
            if (temp.equals(type)) {
                return true;
            }
        }
        return false;
    }
}
