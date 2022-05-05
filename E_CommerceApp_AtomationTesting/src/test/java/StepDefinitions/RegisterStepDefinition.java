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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public  class RegisterStepDefinition {
    WebDriver driver;
    LoginPage login;
    RegisterPage register;
    FirstPage firstPage;


    @Before("@register")
    public void user_open_App() throws InterruptedException {
    //bridge between test script and browsers
    String driverPath =System.getProperty("user.dir")+"\\src\\main\\resources\\browsers\\chromedriver.exe";
    System.setProperty("webdriver.chrome.driver",driverPath);

    //create new object
    driver=new ChromeDriver();
    register=new RegisterPage(driver);
    firstPage =new FirstPage(driver);
    login=new LoginPage(driver);
    // maximize window
    driver.manage().window().maximize();

    //navigate to App
    driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
    Thread.sleep(2000);
}

@Given("user open Register page")
    public void navigateToRegisterPage() throws InterruptedException {

        firstPage.RegisterElement().click();
        Thread.sleep(2000);
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
    public void clickOnRegBtn() throws InterruptedException {
        Thread.sleep(3000);
        register.registerBtn().click();
    }

    @Then("user could register successfully")
    public void registerSuccessfully(){
        String expectedResult="Your registration completed";
        String actualResult = register.TextAfterRegister().getText() ;
        Assert.assertTrue(actualResult.contains(expectedResult));
    }

    @After("@register")
    public void closeBrowser(){
        driver.quit();
    }
}
