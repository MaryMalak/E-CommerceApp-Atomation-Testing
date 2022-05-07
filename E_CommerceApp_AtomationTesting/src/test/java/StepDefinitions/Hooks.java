package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void user_open_App() throws InterruptedException {
        //bridge between test script and browsers
        String driverPath =System.getProperty("user.dir")+"\\src\\main\\resources\\browsers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",driverPath);
        //create new object
        driver=new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();

        //navigate to App
        driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        Thread.sleep(2000);
    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
