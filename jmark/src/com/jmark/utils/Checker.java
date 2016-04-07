package com.jmark.utils;

import java.awt.*;
import java.io.File;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Checker {

    private Robot robot;
    private ComponentFinder finder;

    public Checker(File taskFile) {
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        finder = robot.finder();
    }
}
