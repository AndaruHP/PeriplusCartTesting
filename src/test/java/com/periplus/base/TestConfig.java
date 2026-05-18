package com.periplus.base;

/**
 * Small test configuration holder for clean tests.
 * Values are read first from system properties, then environment variables, then defaults.
 */
public final class TestConfig {
    private TestConfig() {}

    // Read user email from system properties, env vars, or defaults.
    public static String getUserEmail() {
        return firstNonEmpty(System.getProperty("periplus.user"), System.getenv("PERIPLUS_USER"), "andaruandaru1904@gmail.com");
    }

    // Read user password from system properties, env vars, or defaults.
    public static String getUserPassword() {
        return firstNonEmpty(System.getProperty("periplus.password"), System.getenv("PERIPLUS_PASSWORD"), "PeriplusAccount2026");
    }

    // Read search query from system properties, env vars, or defaults.
    public static String getSearchQuery() {
        return firstNonEmpty(System.getProperty("periplus.search"), System.getenv("PERIPLUS_SEARCH"), "How to win friends and influence people");
    }

    // Return the first non-empty value in order.
    private static String firstNonEmpty(String... values) {
        for (String v : values) {
            if (v != null && !v.isEmpty()) return v;
        }
        return "";
    }
}
