package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    WebDriver driver;

    public HomePage() {
        this.driver = Hooks.driver;
    }

    public WebElement LogOutIcon(){
        return driver.findElement(By.className("ico-logout"));
    }

    public WebElement SearchTextLine(){
        return driver.findElement(By.id("small-searchterms"));
    }

    public WebElement SearchBtn(){
        return driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]"));
    }
}
