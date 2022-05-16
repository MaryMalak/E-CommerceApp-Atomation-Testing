package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class I_WishListStepDef {
    HomePage homePage=new HomePage();


    @When("user add a product to wishlist")
    public void AddProductToWishlist()  {
        homePage.WishListBtn().click();

    }

    @Then("wishlist message is displayed in notification bar")
    public void MessageForWishListIsDisplayed() {
        String expectedResult="The product has been added to your wishlist";
        String actualResult=homePage.MessageInBarNotification().getText();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
