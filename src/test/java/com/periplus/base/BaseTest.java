package com.periplus.base;

import com.periplus.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

/**
 * Base TestNG setup for WebDriver lifecycle and app navigation.
 */
public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    private static final String PERIPLUS_URL = "https://periplus.com/";

    // Initialize WebDriver once per class.
    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    // Open the application before each test.
    @BeforeMethod
    public void loadApplication() {
        driver.get(PERIPLUS_URL);
        homePage = new HomePage(driver);
    }

    // Quit the driver when tests finish.
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        if (driver != null) {
            try {
                driver.quit();
            } catch (Exception ignore) {
                // ignore teardown exceptions
            }
        }
    }
}
