package com.automation.steps;

import com.automation.pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeSteps {
    HomePage homePage=new HomePage();

    @Given("user open website")
    public void user_open_website() throws InterruptedException {
        homePage.openWebsite();
        Thread.sleep(5000);
    }
    @When("user clicks reebok brand")
    public void user_clicks_reebok_brand() {
        homePage.selectReebokFootwear();
    }

    @When("clicks on cart icon")
    public void clicks_on_cart_icon() {
        homePage.clickCartIcon();;
    }

}
