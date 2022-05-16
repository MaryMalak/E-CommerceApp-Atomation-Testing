package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class J_ShoppingCartStepDef {
    HomePage homePage = new HomePage();

    @When("user add a product to shopping cart")
    public void AddProductTosShoppingCart()  {
        homePage.AddToCartBtn().click();

    }
    @Then("shopping cart message is displayed in notification bar")
    public void MessageForShoppingCartDisplayed() {
        String expectedResult="The product has been added to your shopping cart";
        String actualResult=homePage.MessageInBarNotification().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}