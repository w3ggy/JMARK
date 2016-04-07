package com.jmark;

import com.jmark.utils.Checker;

import java.io.File;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Application {

    public static File taskFile;

    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(-1);
        }

        if (new File(args[0]).exists()) {
            taskFile = new File(args[0]);
        }

        startChecking();
    }

    public static void startChecking() {
        Checker checker = new Checker(taskFile);
    }
}
