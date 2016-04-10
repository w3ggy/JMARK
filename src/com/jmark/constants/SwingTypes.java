package com.jmark.constants;

import java.util.Arrays;

/**
 * Created by Artyom on 10.04.2016.
 */
public class SwingTypes {

    public static final String JBUTTON = "JButton";
    public static final String JRADIOBUTTON = "JRadioButton";
    public static final String JCHECKBOX = "JCheckBox";
    public static final String JLABEL = "JLabel";
    public static final String JTEXTFIELD = "JTextField";
    public static final String JPASSWORDFIELD = "JPasswordField";
    public static final String JFORMATTEDTEXTFIELD = "JFormattedTextField";
    public static final String JTEXTAREA = "JTextArea";
    public static final String JTEXTPANE = "JTextPane";
    public static final String JEDITORPANE = "JEditorPane";
    public static final String JTABLE = "JTable";
    public static final String JLIST = "JList";
    public static final String JTREE = "JTree";
    public static final String JTABBEDPANE = "JTabbedPane";
    public static final String JSPLITPANE = "JSplitPane";
    public static final String JSPINNER = "JSpinner";
    public static final String JSLIDER = "JSlider";
    public static final String JSEPARATOR = "JSeparator";
    public static final String JPROGRESSBAR = "JProgressBar";
    public static final String JTOOLBAR = "JToolBar";
    public static final String JSCROLLPANE = "JScrollBar";
    public static final String JSCROLLBAR = "JScrollPane";

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

    private static String[] returnActions(String type) {
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
            case JSPLITPANE: {
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

    public static int getMark(String type) {
        switch (type) {
            case JBUTTON: {
                return 5;
            }
            case JRADIOBUTTON: {
                return 3;
            }
            case JCHECKBOX: {
                return 3;
            }
            case JLABEL: {
                return 5;
            }
            case JTEXTFIELD: {
                return 5;
            }
            case JPASSWORDFIELD: {
                return 6;
            }
            case JFORMATTEDTEXTFIELD: {
                return 7;
            }
            case JTEXTAREA: {
                return 7;
            }
            case JTEXTPANE: {
                return 7;
            }
            case JEDITORPANE: {
                return 10;
            }
            case JTABLE: {
                return 5;
            }
            case JLIST: {
                return 5;
            }
            case JTREE: {
                return 5;
            }
            case JTABBEDPANE: {
                return 3;
            }
            case JSPLITPANE: {
                return 3;
            }
            case JSPINNER: {
                return 3;
            }
            case JSLIDER: {
                return 3;
            }
            case JSEPARATOR: {
                return 1;
            }
            case JPROGRESSBAR: {
                return 2;
            }
            case JTOOLBAR: {
                return 5;
            }
            case JSCROLLPANE: {
                return 7;
            }
            case JSCROLLBAR: {
                return 5;
            }
        }
        return 0;
    }

    public static boolean containsType(String type) {
        for (String temp : swingTypes) {
            if (temp.equals(type)) {
                return true;
            }
        }
        return false;
    }
}
