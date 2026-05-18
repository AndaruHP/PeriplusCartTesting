package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

/**
 * Base page object providing common WebDriver helpers for finding elements,
 * interacting with inputs, and waiting for UI overlays to disappear.
 */
public class BasePage {
    protected WebDriver driver;

    protected final By preloader = By.className("preloader");

    // Create a new base page with an active driver.
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Find a single element by locator.
    protected WebElement find(By locator) {
        return driver.findElement(locator);
    }

    // Find all elements matching a locator.
    protected List<WebElement> finds(By locator) {
        return driver.findElements(locator);
    }

    // Clear and type text into an input element.
    protected void set(By locator, String text) {
        find(locator).clear();
        find(locator).sendKeys(text);
    }

    // Click an element located by the given locator.
    protected void click(By locator) {
        find(locator).click();
    }

    // Wait until the element located by the given locator is invisible.
    protected void waitUntilInvisible(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }
}
