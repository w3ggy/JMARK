package com.jmark.utils.logger;

import com.jmark.utils.local_logger.LocalLogger;
import javafx.util.Pair;

import java.io.*;
import java.util.*;

public class Logger {
    private static Logger logger;
    private static String TAG = Logger.class.getSimpleName();

    private List<LogItem> logs = new ArrayList<>();

    public static synchronized Logger getInstance() {
        return logger == null ? new Logger() : logger;
    }

    private Logger() {
    }

    public void logMessage(String tag, String message) {
        logMessage(tag, message, new ArrayList<>());
    }

    public void logMessage(String tag, String message, List<Pair<String, String>> properties) {
        logs.add(new LogItem(tag, message, properties));
    }

    public void saveLogs() {
        File logsFile = createLogsFile();

        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logsFile), "UTF8"))) {
            LocalLogger.log(TAG,"Start writing logs to the file");
            writeHeadOfTheFile(writer);

            for (LogItem log : logs) {
                writeTest(writer, log);
            }

            writeFootOfTheFile(writer);
            LocalLogger.log(TAG,"Writing logs to the file ended successful");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            LocalLogger.log(TAG,"Logs file not found!");
        } catch (IOException e) {
            e.printStackTrace();
            LocalLogger.log(TAG,"Error while writing logs to the file!");
        }
    }

    public void userAuthorized() {
        String message = String.format(Locale.getDefault(), "%d", System.currentTimeMillis());
        logMessage(LogType.USER_AUTHORIZED.getTag(), message);
    }

    public void appChecked(long time) {
        String message = String.format(Locale.getDefault(), "%d", time);
        logMessage(LogType.APP_CHECK.getTag(), message);
    }

    public void componentChecked(String component, long time) {
        List<Pair<String, String>> properties = new ArrayList<>();
        properties.add(new Pair<>("component", component));

        String message = String.format(Locale.getDefault(), "%d", time);
        logMessage(LogType.COMPONENT_CHECK.getTag(), message, properties);
    }

    private void writeHeadOfTheFile(BufferedWriter writer) throws IOException {
        String head = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<logs>\n";
        writer.write(head.toCharArray());
    }

    private void writeFootOfTheFile(BufferedWriter writer) throws IOException {
        String head = "</logs>\n";
        writer.write(head.toCharArray());
    }

    public File createLogsFile() {
        File logsFile = new File("logs.xml");

        try {
            logsFile.createNewFile();
            LocalLogger.log(TAG,"Logs file has been created!");
        } catch (IOException e) {
            e.printStackTrace();
            LocalLogger.log(TAG,"Logs file hasn't been created!");
        }

        return logsFile;
    }

    private void writeTest(BufferedWriter writer, LogItem logItem) throws IOException {
        StringBuilder additionalProperties = new StringBuilder();

        for (Pair<String, String> property : logItem.getProperties()) {
            additionalProperties.append("\n\t\t\t")
                    .append(property.getKey())
                    .append("=\"")
                    .append(property.getValue())
                    .append("\"");
        }

        String head = String.format(Locale.getDefault(), "\t<log tag=\"%s\" %s>\n" +
                "\t\t%s\n" +
                "\t</log>\n" +
                "\n", logItem.getTag(), additionalProperties.toString(), logItem.getMesage());

        writer.write(head.toCharArray());
    }
}
