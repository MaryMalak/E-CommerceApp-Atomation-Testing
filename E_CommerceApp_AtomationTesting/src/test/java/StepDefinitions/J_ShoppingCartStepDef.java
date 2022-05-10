package StepDefinitions;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class J_ShoppingCartStepDef {
    ProductDetailsPage PDP = new ProductDetailsPage();
    HomePage homePage = new HomePage();

    @When("Guest user click on any product {string} and click on shopping cart btn")
    public void AddProductTosShoppingCart(String productName) throws InterruptedException {
        homePage.product(productName).click();
        PDP.AddToCartBtn().click();
        Thread.sleep(3000);

    }

    @Then("user find message for shopping cart {string} is displayed in bar notification")
    public void MessageForShoppingCartDisplayed(String msg) {
        String expectedResult=msg;
        String actualResult=PDP.MessageInBarNotification().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }
}