package com.periplus.test;

import com.periplus.base.BaseTest;
import com.periplus.base.TestConfig;
import com.periplus.base.TestLogger;
import com.periplus.pages.CartPage;
import com.periplus.pages.LoginPage;
import com.periplus.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CartTest extends BaseTest {
    @Test
    public void cartChecking() {
        TestLogger.step("Open login page and sign in");
        homePage.clickSignInLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.logInWeb(TestConfig.getUserEmail(), TestConfig.getUserPassword());

        TestLogger.step("Search for product and open details");
        homePage.searchBook(TestConfig.getSearchQuery());
        homePage.clickFirstProduct();

        ProductPage productPage = new ProductPage(driver);
        TestLogger.step("Verify product stock");
        Assert.assertTrue(productPage.isProductInStock());

        TestLogger.step("Add product to cart");
        productPage.addProductToCart("1");

        TestLogger.step("Open cart and verify contents");
        CartPage cartPage = productPage.clickCartButton();
        Assert.assertTrue(cartPage.isCartNotEmpty());

        TestLogger.pass("Cart test completed");
    }
}
