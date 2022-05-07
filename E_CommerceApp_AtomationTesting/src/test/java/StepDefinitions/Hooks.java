package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void user_open_App() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
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
