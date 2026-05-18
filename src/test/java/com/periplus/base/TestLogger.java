package com.periplus.base;

public final class TestLogger {
    private TestLogger() {}

    public static void step(String message) {
        System.out.println("[STEP] " + message);
    }

    public static void info(String message) {
        System.out.println("[INFO] " + message);
    }

    public static void pass(String message) {
        System.out.println("[PASS] " + message);
    }

    public static void fail(String message) {
        System.out.println("[FAIL] " + message);
    }
}

