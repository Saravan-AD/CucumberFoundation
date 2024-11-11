package com.automation.steps;

import com.automation.pages.CartPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CartSteps {

    CartPage cartPage=new CartPage();

    @Then("verify the quantity is correct")
    public void verify_the_quantity_is_correct() {
        cartPage.checkCartQty();
        Assert.assertEquals("3",ConfigReader.getConfig("cart.qty"));
    }

    @Then("verify user is on cart page")
    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPage.isCartPageDisplayed());
    }
}
