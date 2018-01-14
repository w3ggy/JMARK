package com.jmark.utils.local_logger;

public class LocalLogger {
    public static void log(String tag, String message) {
        System.out.println(String.format("%s: %s", tag, message));
    }
}
