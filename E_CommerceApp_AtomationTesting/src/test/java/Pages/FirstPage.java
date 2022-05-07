package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
    WebDriver driver;

    public FirstPage() {
        this.driver = Hooks.driver ;
    }
    public WebElement RegisterElement(){
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement loginElement(){
        return driver.findElement(By.className("ico-login"));
    }
}
