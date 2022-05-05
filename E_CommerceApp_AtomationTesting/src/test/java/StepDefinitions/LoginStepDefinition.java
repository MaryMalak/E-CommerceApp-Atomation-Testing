package StepDefinitions;

import Pages.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginStepDefinition {
    public WebDriver driver  ;
     LoginPage login;
    FirstPage firstPage;
     HomePage homePage;

    public WebDriver getDriver() {
        return driver;
    }

    @Before("@login")
    public void user_open_App() throws InterruptedException {
        //bridge between test script and browsers
        String driverPath =System.getProperty("user.dir")+"\\src\\main\\resources\\browsers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        //create new object
        driver=new ChromeDriver();
        login=new LoginPage(driver);
        firstPage =new FirstPage(driver);
        homePage=new HomePage(driver);
        // maximize window
        driver.manage().window().maximize();

        //navigate to App
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(2000);
    }

    @Given("user open login page")
    public void navigateToLoginpage() throws InterruptedException {
        firstPage.loginElement().click(); ;
        Thread.sleep(2000);
    }

    @When("^user enter valid email \"(.*)\" and password \"(.*)\"$")
    public void validData(String email,String pass)  {
        login.emilElement().sendKeys(email);
        login.passwordElement().sendKeys(pass);

    }

    @And("user click on login button")
    public void loginBtn() throws InterruptedException {
        Thread.sleep(2000);
        login.loginBtn().click();
    }

    @Then("user could login successfully")
    public void loginSuccessfully() throws InterruptedException {
        Thread.sleep(5000);
        boolean expectedResult=true;
        boolean actualResult =homePage.LogOutIcon().isDisplayed();
        Assert.assertEquals(expectedResult,actualResult);
       // Assert.assertTrue(homePage.LogOutIcon().isDisplayed());
    }

    @After("@login")
    public void closeBrowser(){
        driver.quit();
    }


}
