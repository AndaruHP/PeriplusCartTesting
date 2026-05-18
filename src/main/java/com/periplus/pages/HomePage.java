package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page object for the Periplus home page.
 */
public class HomePage extends BasePage {
    // Create a new home page instance.
    public HomePage(WebDriver driver) {
        super(driver);
    }

    private final By signInLink = By.xpath("//span[@id='nav-signin-text']/a[text()='Sign In']");

    // Open the sign-in page.
    public void clickSignInLink() {
        click(signInLink);
    }

    private final By searchBookField = By.xpath("//input[@id='filter_name_desktop']");
    private final By searchButton = By.xpath("//form[.//input[@id='filter_name_desktop']]//button[@type='submit']");

    // Fill the search input with a book title.
    public void setSearchBookField(String bookName) {
        set(searchBookField, bookName);
    }

    // Submit the search form.
    public void clickSearchButton() {
        waitUntilInvisible(preloader);
        click(searchButton);
    }

    // Search for a book by name.
    public void searchBook(String bookName) {
        setSearchBookField(bookName);
        clickSearchButton();
    }

    private final By productList = By.className("single-product");

    // Open the first product from the search results.
    public void clickFirstProduct() {
        waitUntilInvisible(preloader);
        finds(productList).getFirst().click();
    }
}
