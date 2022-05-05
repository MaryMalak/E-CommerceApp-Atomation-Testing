package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement emilElement(){
        return driver.findElement(By.id("Email"));
    }
    public WebElement passwordElement(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement loginBtn(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 login-button\"]"));
    }
    public WebElement forgotPassElement(){
        return driver.findElement(By.className("forgot-password"));
    }

}
