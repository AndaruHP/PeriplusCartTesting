package com.periplus.base;

/**
 * Simple console logger for test steps and status.
 */
public final class TestLogger {
    private TestLogger() {}

    // Log a test step.
    public static void step(String message) {
        System.out.println("[STEP] " + message);
    }

    // Log informational output.
    public static void info(String message) {
        System.out.println("[INFO] " + message);
    }

    // Log a passing message.
    public static void pass(String message) {
        System.out.println("[PASS] " + message);
    }

    // Log a failure message.
    public static void fail(String message) {
        System.out.println("[FAIL] " + message);
    }
}
