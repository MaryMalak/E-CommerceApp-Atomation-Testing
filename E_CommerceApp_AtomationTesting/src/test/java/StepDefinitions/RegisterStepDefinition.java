package StepDefinitions;

import Pages.FirstPage;
import Pages.LoginPage;
import Pages.RegisterPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public  class RegisterStepDefinition {
    LoginPage login=new LoginPage();
    RegisterPage register=new RegisterPage() ;
    FirstPage firstPage=new FirstPage();

    @Given("user open Register page")
    public void navigateToRegisterPage() {

        firstPage.RegisterElement().click();
    }
    @When("^user choose gender \"(.*)\"$")
    public void chooseGender (String gender){
        register.chooseGenderElement(gender).click();
    }
    @And("^user enter first name \"(.*)\"$")
    public void enterFN(String FirstName){
        register.firstNameElement().sendKeys(FirstName);
    }
    @And("^user enter last name \"(.*)\"$")
    public void enterLN(String LastName){
        register.lastNameElement().sendKeys(LastName);
    }

    @And("^user enter valid email address \"(.*)\"$")
    public void validEmailToRegister(String email){
        login.emilElement().sendKeys(email);
    }
    @And("^user enter new password and confirm it \"(.*)\"$")
    public void enterPass(String pass){
        register.passwordElement().sendKeys(pass);
        register.confirmPassElement().sendKeys(pass);
    }
    @And("user click on Register button")
    public void clickOnRegBtn()  {
        register.registerBtn().click();
    }

    @Then("user could register successfully")
    public void registerSuccessfully(){
        String expectedResult="Your registration completed";
        String actualResult = register.TextAfterRegister().getText() ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

}
