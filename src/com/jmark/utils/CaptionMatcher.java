package com.jmark.utils;

import com.jmark.constants.SwingTypes;
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
//        if (comp != null && SwingTypes.containsType(comp.getClass().getSimpleName()) && caption.equals(comp.getName())) {
        if (comp != null && SwingTypes.containsType(comp.getClass().getSimpleName()) && caption.equals(FindComponentName.getComponentVariableName(comp))) {
            return true;
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
