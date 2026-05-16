package com.periplus.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {
    private By signInLink = By.cssSelector("#nav-signin-text a");

    public void clickSignInLink() {
        click(signInLink);
    }
}
