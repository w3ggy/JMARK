package com.jmark.utils.checker;

import com.jmark.constants.SwingTypes;
import com.jmark.utils.ActionWithComponent;
import com.jmark.utils.CaptionMatcher;
import com.jmark.utils.TestItem;
import com.jmark.utils.local_logger.LocalLogger;
import com.jmark.utils.logger.Logger;
import org.fest.swing.core.BasicRobot;
import org.fest.swing.core.ComponentFinder;
import org.fest.swing.core.Robot;
import org.fest.swing.exception.ComponentLookupException;

import java.awt.*;
import java.util.List;

/**
 * Created by Artyom on 08.04.2016.
 */
public class Checker implements Runnable, CheckerLifeCycle {
    private static final String TAG = Checker.class.getSimpleName();

    private Robot robot;
    private ComponentFinder finder;
    private List<TestItem> testItems;
    private int resultEstimate;
    private int currentEstimate;
    private Logger logger = Logger.getInstance();
    private long checkTime;

    public Checker(List<TestItem> testItems) {
        robot = BasicRobot.robotWithCurrentAwtHierarchy();
        finder = robot.finder();
        this.testItems = testItems;
    }

    @Override
    public void beforeCheck() {
        checkTime = System.currentTimeMillis();
        LocalLogger.log(TAG,"STARTING CHECKING");
        System.out.println("=======================================");
        sleepThread(1000);
    }

    @Override
    public void check() {
        for (TestItem testItem : testItems) {
            sleepThread(100);
            CaptionMatcher matcher = new CaptionMatcher(testItem.getName(), testItem.getComponent());
            test(matcher, testItem);
        }
    }

    @Override
    public void afterCheck() {
        LocalLogger.log(TAG,"=======================================");
        LocalLogger.log(TAG,"Итоговая оценка: " +
                currentEstimate + " / " + resultEstimate +
                "\n" + 100 * currentEstimate / resultEstimate + "%");

        checkTime = System.currentTimeMillis() - checkTime;
        logger.appChecked(checkTime);
        logger.saveLogs();
    }

    @Override
    public void run() {
        beforeCheck();
        check();
        afterCheck();
    }

    private void test(CaptionMatcher matcher, TestItem testItem) {
        Component tmp;
        long componentCheckTime = System.currentTimeMillis();
        try {
            resultEstimate += SwingTypes.getMark(testItem.getComponent());
            tmp = finder.find(matcher);

            final Component foundComponent = tmp;
            //robot.moveMouse(tmp);
            //robot.click(tmp);
//            robot.enterText("Do you know it?");
//            robot.waitForIdle();
            currentEstimate += ActionWithComponent.actionWithComponent(robot, foundComponent, testItem);
        } catch (ComponentLookupException e) {
            LocalLogger.log(TAG,"Test № " + testItem.getTestID());
            LocalLogger.log(TAG,"false");
            LocalLogger.log(TAG,"There isn't component with this name: " + testItem.getName());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            componentCheckTime = System.currentTimeMillis() - componentCheckTime;
            logger.componentChecked(testItem.getComponent(), componentCheckTime);
        }
    }

    private void sleepThread(int N) {
        try {
            Thread.sleep(N);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
