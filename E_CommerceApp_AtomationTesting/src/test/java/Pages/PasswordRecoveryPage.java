package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PasswordRecoveryPage {
    WebDriver driver;

    public PasswordRecoveryPage() {
        this.driver = Hooks.driver;
    }
    public WebElement RecoverBtn(){
        return driver.findElement(By.name("send-email"));
    }
    public WebElement messAfterResetPass(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

}
