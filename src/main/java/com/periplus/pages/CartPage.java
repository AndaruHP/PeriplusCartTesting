package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {
    private final By cartRoot = By.id("basket");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    public boolean isCartNotEmpty() {
        return !finds(cartRoot).isEmpty();
    }
}
