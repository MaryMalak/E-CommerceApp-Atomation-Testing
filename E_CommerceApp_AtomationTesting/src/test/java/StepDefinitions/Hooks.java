package StepDefinitions;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void user_open_App() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        // maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        //navigate to App
        driver.navigate().to("https://demo.nopcommerce.com/");
        //driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");

    }
    @After
    public void closeBrowser(){
        driver.quit();
    }
}
