package StepDefinitions;

import Pages.HomePage;
import Pages.ProductDetailsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class I_WishListStepDef {
    ProductDetailsPage PDP=new ProductDetailsPage();
    HomePage homePage=new HomePage();


    @When("Guest user click on any product {string} and click on wishlist btn")
    public void AddProductToWishlist(String productName) throws InterruptedException {
        homePage.product(productName).click();
        PDP.WishListBtn().click();
        Thread.sleep(3000);

    }

    @Then("user find message for wishlist {string} is displayed in bar notification")
    public void MessageForWishListIsDisplayed(String msg) {
        String expectedResult=msg;
        String actualResult=PDP.MessageInBarNotification().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
