package com.jmark;

import com.jmark.ui.MainWindow;
import com.jmark.utils.checker.Checker;
import com.jmark.utils.FileParser;
import com.jmark.utils.TestItem;
import com.jmark.utils.logger.Logger;
import sun.rmi.runtime.Log;

import java.io.File;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Application {

    private static File taskFile;
    private static List<TestItem> testItems;
    private static Logger logger = Logger.getInstance();

    public static void main(String[] args) {
        logger.userAuthorized(); //TODO Remove this before release

        args = new String[1];
        args[0] = "tasks.xml";
        if (args.length != 1) {
            System.out.println("There isn't file!");
            System.exit(-1);
        }

        if (new File(args[0]).exists()) {
            taskFile = new File(args[0]);
            System.out.println("File has been found");
        }
        FileParser parser = new FileParser(taskFile);
        testItems = parser.getTestItems();

        MainWindow window = new MainWindow();
        startChecking();
    }

    public static void startChecking() {
        Checker checker = new Checker(testItems);
        Thread thread = new Thread(checker);
        thread.start();
    }
}
