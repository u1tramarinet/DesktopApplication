package com.u1tramarinet.DesktopApplication.util;

public class Logger {
    private Logger() {

    }

    public static void d(String tag, String message) {
        printMessage(tag, message);
    }

    public static void d(String tag, String format, Object... args) {
        printMessage(tag, String.format(format, args));
    }

    public static void threadInfo(String tag) {
        Thread thread = Thread.currentThread();
        String message = String.format("[%d] %s", thread.getId(), thread.getName());
        printMessage(tag, message);
    }

    private static void printMessage(String tag, String message) {
        printMessage(getFormatMessage(tag, message));
    }

    private static void printMessage(String message) {
        System.out.println(message);
    }

    private static String getFormatMessage(String tag, String message) {
        return String.format("%s: %s", tag, message);
    }
}
