package com.periplus.test;

import com.periplus.base.BaseTest;
import com.periplus.pages.LoginPage;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void cartChecking() {
        homePage.clickSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInWeb("andaruandaru1904@gmail.com", "PeriplusAccount2026");
    }
}
