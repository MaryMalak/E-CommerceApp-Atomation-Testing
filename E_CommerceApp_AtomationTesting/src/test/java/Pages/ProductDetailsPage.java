package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {
    WebDriver driver;

    public ProductDetailsPage() {
        this.driver= Hooks.driver;
    }
    public WebElement BarNotification(){
        return driver.findElement(By.id("bar-notification"));
    }
    public WebElement MessageInBarNotification(){
        return driver.findElement(By.cssSelector("p[class=\"content\"]"));
    }

    public  WebElement WishListBtn(){
        return driver.findElement(By.id("add-to-wishlist-button-4"));
    }
    public WebElement AddToCartBtn(){
        return driver.findElement(By.id("add-to-cart-button-4"));
    }
}
