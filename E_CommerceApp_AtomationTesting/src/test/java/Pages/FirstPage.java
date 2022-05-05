package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FirstPage {
    WebDriver driver;

    public FirstPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement RegisterElement(){
        return driver.findElement(By.className("ico-register"));
    }
    public WebElement loginElement(){
        return driver.findElement(By.className("ico-login"));
    }
}
