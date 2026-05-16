package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInLink = By.xpath("//span[@id='nav-signin-text']/a[text()='Sign In']");
    private final By searchBookField = By.xpath("//input[@id='filter_name_desktop']");
    private final By searchButton = By.xpath("//form[.//input[@id='filter_name_desktop']]//button[@type='submit']");
    private final By preloader = By.className("preloader");
    private final By productList = By.className("single-product");

    public void clickSignInLink() {
        click(signInLink);
    }

    public void setSearchBookField(String bookName) {
        set(searchBookField, bookName);
    }

    public void clickSearchButton() {
        waitUntilInvisible(preloader);
        click(searchButton);
    }

    public void searchBook(String bookName) {
        setSearchBookField(bookName);
        clickSearchButton();
    }

    public void clickFirstProduct() {
        waitUntilInvisible(preloader);
        finds(productList).getFirst().click();
    }
}
