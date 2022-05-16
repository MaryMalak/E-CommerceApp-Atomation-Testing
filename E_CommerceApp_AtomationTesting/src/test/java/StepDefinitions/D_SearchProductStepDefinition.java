package StepDefinitions;


import Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.assertj.core.api.SoftAssertions;

public class D_SearchProductStepDefinition {
    HomePage homePage=new HomePage();
    SoftAssertions  softAssertions = new SoftAssertions();



    @When("user enter any product \\( {string} ) and click search")
    public void searchForProductByName(String product)  {
        homePage.SearchTextLine().sendKeys(product);
        homePage.SearchBtn().click();
    }

    @Then("user could Search for this product \\( {string} ) successfully")
    public void searchForProductByNameSuccessfully(String product) {
        String expectedResult="/search?q="+product;
        String acualResult=Hooks.driver.getCurrentUrl();
        softAssertions.assertThat(acualResult).contains(expectedResult);
        softAssertions.assertThat(homePage.SizeOfItemGrid()).isGreaterThan(0);
        softAssertions.assertAll();
    }

    @When("user enter any Sku\\({string}) and click search")
    public void searchForProductBySKU(String SKU)  {
        homePage.SearchTextLine().sendKeys(SKU);
        homePage.SearchBtn().click();
    }

    @Then("user could Search the product by this SKU \\({string}) successfully")
    public void searchForProductBySKUSuccessfully(String SKU) {
        String expectedResult="/search?q="+SKU;
        String acualResult=Hooks.driver.getCurrentUrl();
        softAssertions.assertThat(acualResult).contains(expectedResult);
        softAssertions.assertThat(homePage.SizeOfItemGrid()).isGreaterThan(0);
        softAssertions.assertAll();
    }
}
