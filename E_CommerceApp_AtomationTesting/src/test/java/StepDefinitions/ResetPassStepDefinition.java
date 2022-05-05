package StepDefinitions;

import Pages.FirstPage;
import Pages.LoginPage;
import Pages.PasswordRecoveryPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResetPassStepDefinition {
    WebDriver driver;
    FirstPage firstPage;
    LoginPage login;
    PasswordRecoveryPage passwordRecovery;
    @Before("@ResetPass")
    public void user_open_App() throws InterruptedException {
        //bridge between test script and browsers
        String driverPath =System.getProperty("user.dir")+"\\src\\main\\resources\\browsers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        //create new object
        driver=new ChromeDriver();
        login=new LoginPage(driver);
        passwordRecovery=new PasswordRecoveryPage(driver);
        firstPage =new FirstPage(driver);
        // maximize window
        driver.manage().window().maximize();

        //navigate to App
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(2000);
    }

    @Given("user go to login page")
    public void goToLoginpage() throws InterruptedException {
        firstPage.loginElement().click(); ;
        Thread.sleep(2000);
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

    @After("@ResetPass")
    public void closeBrowser(){
        driver.quit();
    }
}
