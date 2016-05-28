package com.jmark.utils;

import org.fest.swing.core.ComponentMatcher;

import java.awt.*;

/**
 * Created by Artyom on 08.04.2016.
 */
public class CaptionMatcher implements ComponentMatcher {
    private String caption;
    private String type;

    public CaptionMatcher(String caption, String type) {
        this.setType(type);
        this.setCaption(caption);
    }

    @Override
    public boolean matches(Component comp) {
        switch (type) {
            case "JButton":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JRadioButton":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JCheckBox":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JLabel":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTextField":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;

            case "JPasswordField":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JFormnattedTextField":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTextArea":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTextPane":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JEditorPane":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JComboBox":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTable":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JList":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTree":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JTabbedPane":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JSplitPane":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JSpinner":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JSlider":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JSeparator":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JProgressBar":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JToolBar":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;
            case "JScrollBar":
                if (comp != null) {
                    if (caption.equals(FindComponentName.getComponentVariableName(comp))) {
                        return true;
                    }
                }
                break;

        }
        return false;

    }



    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setType(String type) {

        this.type = type;
    }

}
