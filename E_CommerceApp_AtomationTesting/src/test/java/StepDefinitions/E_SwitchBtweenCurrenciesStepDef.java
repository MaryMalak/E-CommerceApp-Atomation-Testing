package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;



public class E_SwitchBtweenCurrenciesStepDef {
    HomePage homePage=new HomePage();
    @When("user could select Euro currency")
    public void UserSelecteUS()  {
        Select concurency = new Select(homePage.customerCurrencyDropdown());
        concurency.selectByVisibleText("Euro");
    }
    @Then("User could switch between currencies successfully")
    public void UserSwitchBetweenCurrenciesSuccessfully(){
        String expectedResult="€";
        String actualResult=homePage.price().getText() ;
        Assert.assertTrue( actualResult.contains(expectedResult));
    }
}
