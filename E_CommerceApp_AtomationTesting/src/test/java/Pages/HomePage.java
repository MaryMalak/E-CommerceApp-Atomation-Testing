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

    public WebElement customerCurrencyDropdown(){
        return driver.findElement(By.id("customerCurrency"));
    }

    public WebElement price(){
        return driver.findElement(By.cssSelector("span[class=\"price actual-price\"]"));
    }

    public WebElement menuOfCategories(String category){
        return driver.findElement(By.cssSelector("ul[class=\"top-menu notmobile\"]>li>a[href=\"/"+category+"\"]"));
    }
    public WebElement pageTitle(){
        return driver.findElement(By.className("page-title"));
    }
    public WebElement menuOfSubCategories(String subCategory){
        return driver.findElement(By.cssSelector("li>ul[class=\"sublist\"]>li>a[href=\"/"+subCategory +"\"]"));
    }

    public WebElement FollowUsFacebookLogo(){
        return driver.findElement(By.cssSelector("li[class=\"facebook\"]>a[rel=\"noopener noreferrer\"]"));
        //return driver.findElement(By.className("facebook"));
    }

    public WebElement FollowUsTwitterLogo(){
        return driver.findElement(By.cssSelector("li[class=\"twitter\"]>a[rel=\"noopener noreferrer\"]"));
       // return driver.findElement(By.className("twitter"));
    }

    public WebElement FollowUsRSSLogo(){
        return driver.findElement(By.className("rss"));
    }
    public WebElement FollowUsYoutubeLogo(){
        return driver.findElement(By.cssSelector("li[class=\"youtube\"]>a[rel=\"noopener noreferrer\"]"));
    }

    public WebElement product(String productName)  {
        return driver.findElement(By.cssSelector("img[title=\"Show details for "+productName));
    }
    public WebElement sliderWrapper(){
        return driver.findElement(By.id("nivo-slider"));
    }
}
