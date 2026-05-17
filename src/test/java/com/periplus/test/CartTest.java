package com.periplus.test;

import com.periplus.base.BaseTest;
import com.periplus.pages.CartPage;
import com.periplus.pages.LoginPage;
import com.periplus.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void cartChecking() {
        homePage.clickSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInWeb("andaruandaru1904@gmail.com", "PeriplusAccount2026");

        homePage.searchBook("How to win friends and influence people");
        homePage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isProductInStock());

        productPage.addProductToCart("1");

        CartPage cartPage = productPage.clickCartButton();

        Assert.assertTrue(cartPage.isCartNotEmpty());
    }
}
