package StepDefinitions;


import Pages.HomePage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class SearchProductStepDefinition {
    HomePage homePage=new HomePage();




    @When("user enter any product \\( {string} ) and click search")
    public void searchForProduct(String product)  {
        homePage.SearchTextLine().sendKeys(product);
        homePage.SearchBtn().click();

    }
    @Then("user could Search for this product successfully")
    public void searchForProductSuccessfully(){
        String expectedResult="/search";
        String acualResult=Hooks.driver.getCurrentUrl();
        Assert.assertTrue(acualResult.contains(expectedResult));
    }
}
