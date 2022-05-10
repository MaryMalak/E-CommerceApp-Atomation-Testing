package StepDefinitions;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class B_LoginStepDefinition {
    LoginPage login = new LoginPage();
    FirstPage firstPage = new FirstPage();
    HomePage homePage = new HomePage();


    @Given("user open login page")
    public void navigateToLoginpage() throws InterruptedException {
        firstPage.loginElement().click();

        Thread.sleep(2000);
    }

    @When("^user enter valid email \"(.*)\" and password \"(.*)\"$")
    public void validData(String email, String pass) {
        login.emilElement().sendKeys(email);
        login.passwordElement().sendKeys(pass);
    }

    @And("user click on login button")
    public void loginBtn()  {

        login.loginBtn().click();
    }

    @Then("user could login successfully")
    public void loginSuccessfully()  {
        boolean expectedResult = true;
        boolean actualResult = homePage.LogOutIcon().isDisplayed();
        Assert.assertEquals(expectedResult, actualResult);
        // Assert.assertTrue(homePage.LogOutIcon().isDisplayed());
    }

}