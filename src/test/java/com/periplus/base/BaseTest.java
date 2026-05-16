package com.periplus.base;

import com.periplus.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;
    protected HomePage homePage;
    private String PERIPLUS_URL = "https://periplus.com/";

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(PERIPLUS_URL);
        homePage = new HomePage(driver);
    }

//    @AfterClass
//    public void tearDown() {
//        driver.quit();
//    }
}
