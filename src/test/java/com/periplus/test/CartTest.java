package com.periplus.test;

import com.periplus.base.BaseTest;
import com.periplus.base.TestConfig;
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
        loginPage.logInWeb(TestConfig.getUserEmail(), TestConfig.getUserPassword());

        homePage.searchBook(TestConfig.getSearchQuery());
        homePage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        Assert.assertTrue(productPage.isProductInStock());

        productPage.addProductToCart("1");

        CartPage cartPage = productPage.clickCartButton();

        Assert.assertTrue(cartPage.isCartNotEmpty());
    }
}
