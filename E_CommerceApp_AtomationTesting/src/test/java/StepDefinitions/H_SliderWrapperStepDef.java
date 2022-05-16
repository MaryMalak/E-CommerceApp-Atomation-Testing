package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class H_SliderWrapperStepDef {
    HomePage homePage=new HomePage();
    @When("user clicks on first slider")
    public void clickOnFirstSlider(){
        homePage.sliderWrapper(0).click();


    }

    @Then("relative product for first slider is displayed")
    public void firstProductIsDisplayed() {
        String expectedResult="https://demo.nopcommerce.com/iphone";
        String actualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }

    @When("user clicks on second slider")
    public void clicksOnSecondSlider() {
        homePage.sliderWrapper(1).click();
    }

    @Then("relative product for second slider is displayed")
    public void secondProductIsDisplayed() {
        String expectedResult="https://demo.nopcommerce.com/nokia-lumia-1020";
        String actualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,actualResult);
    }
}
