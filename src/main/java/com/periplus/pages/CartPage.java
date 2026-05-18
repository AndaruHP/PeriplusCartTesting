package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page object for the cart page.
 */
public class CartPage extends BasePage {
    private final By cartRoot = By.id("basket");

    // Create a new cart page instance.
    public CartPage(WebDriver driver) {
        super(driver);
    }

    // Check whether the cart root exists.
    public boolean isCartNotEmpty() {
        return !finds(cartRoot).isEmpty();
    }
}
