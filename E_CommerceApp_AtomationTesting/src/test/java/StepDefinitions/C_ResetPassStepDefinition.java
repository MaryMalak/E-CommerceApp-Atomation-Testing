package StepDefinitions;

import Pages.FirstPage;
import Pages.LoginPage;
import Pages.PasswordRecoveryPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class C_ResetPassStepDefinition {
    FirstPage firstPage=new FirstPage();
    LoginPage login=new LoginPage();
    PasswordRecoveryPage passwordRecovery=new PasswordRecoveryPage();

    @Given("user go to login page")
    public void goToLoginpage()  {
        firstPage.loginElement().click(); ;

    }
    @When("user click on \"forgot password\"")
    public void forgotPass(){
        login.forgotPassElement().click();
    }
    @And("^user enter email address \"(.*)\"$")
    public void validEmailToResetPass(String email){
        login.emilElement().sendKeys(email);
    }
    @And("user click on Recover button")
    public void RecoverBtn(){
        passwordRecovery.RecoverBtn().click();
    }
    @Then("user receive Email with instructions")
    public void receiveEmail(){
        boolean expectedResult=true;
        boolean actualResult=passwordRecovery.messAfterResetPass().isDisplayed();
        Assert.assertEquals(expectedResult,actualResult);
    }

}
