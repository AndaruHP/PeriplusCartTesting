package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    private final By stockStatus = By.className("instock");
    private final By quantityField = By.xpath("//input[contains(@class, 'input-number')]");
    private final By addToCartButton = By.xpath("//button[contains(@class, 'btn-add-to-cart')]");
    private final By successAddToCartText = By.xpath("//div[contains(text(), 'Success add to cart')]");
    private final By notificationModal = By.id("Notification-Modal");

    public boolean isProductInStock() {
        return find(stockStatus).getText().contains("In Stock");
    }


    public void setQuantityField(String quantity) {
        WebElement element = find(quantityField);
        element.sendKeys(Keys.CONTROL + "a");
        element.sendKeys(quantity);

    }

    public void clickAddToCart() {
        waitUntilInvisible(preloader);
        waitUntilInvisible(successAddToCartText);
        click(addToCartButton);
    }

    public void addProductToCart(String quantity) {
        setQuantityField(quantity);
        clickAddToCart();
    }

    private final By cartButtonPage = By.xpath("//div[@id='show-your-cart']");

    public void clickCartButton() {
        waitUntilInvisible(preloader);
        waitUntilInvisible(notificationModal);
        click(cartButtonPage);
    }
}
