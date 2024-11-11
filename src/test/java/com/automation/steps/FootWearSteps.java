package com.automation.steps;

import com.automation.pages.FootWearPage;
import com.automation.utils.ConfigReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FootWearSteps {

    FootWearPage footWearPage=new FootWearPage();
    @Then("verify user is on footwear page")
    public void verify_user_is_on_footwear_page() {
        Assert.assertTrue(footWearPage.isFootwearDeptPageDisplayed());
    }
    @When("user selects the first three products")
    public void user_selects_the_first_three_products() throws InterruptedException {
        footWearPage.selectFirstThreeProducts();;
    }


    @When("user selects price low to high sort option")
    public void userSelectsPriceLowToHighSortOption() throws InterruptedException {
        footWearPage.sortProducts();
        Thread.sleep(1000);
    }

    @Then("verify is the sorting is correct")
    public void verifyIsTheSortingIsCorrect() {
        footWearPage.checkSorting();
        Assert.assertTrue(ConfigReader.getConfig("sort.list").equals(ConfigReader.getConfig("expected.list")));
    }
}
