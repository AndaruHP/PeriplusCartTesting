package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By loginButton = By.xpath("//input[@id='button-login']");


    public void setEmail(String email) {
        set(emailField, email);
    }

    public void setPassword (String password) {
        set(passwordField, password);
    }

    public HomePage clickLoginButton() {
        click(loginButton);
        return new HomePage(driver);
    }

    public HomePage logInWeb(String email, String password) {
        setEmail(email);
        setPassword(password);
        return clickLoginButton();
    }
}
