package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Page object for the login page.
 */
public class LoginPage extends BasePage {
    // Create a new login page instance.
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//input[@id='button-login']");

    // Fill the email input.
    public void setEmail(String email) {
        set(emailField, email);
    }

    // Fill the password input.
    public void setPassword(String password) {
        set(passwordField, password);
    }

    // Click the login button and return the home page.
    public HomePage clickLoginButton() {
        click(loginButton);
        return new HomePage(driver);
    }

    // Perform login with the provided credentials.
    public HomePage logInWeb(String email, String password) {
        setEmail(email);
        setPassword(password);
        return clickLoginButton();
    }
}
