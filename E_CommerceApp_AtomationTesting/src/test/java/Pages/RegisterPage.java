package Pages;

import StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegisterPage  {
    WebDriver driver;

    public RegisterPage() {
        this.driver = Hooks.driver;
    }

    public WebElement chooseGenderElement(String gender){
        if(gender.equals("female")){
            return driver.findElement(By.id("gender-female"));
        }
        else if (gender.equals("male")){

            return driver.findElement(By.id("gender-male"));
        }
        else{
            System.out.println("no gender");
            return null;
        }

    }

    public WebElement firstNameElement(){
        return driver.findElement(By.id("FirstName"));

    }
    public WebElement lastNameElement(){
        return driver.findElement(By.id("LastName"));

    }
    public WebElement passwordElement(){
        return driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassElement(){
        return driver.findElement(By.id("ConfirmPassword"));
    }

    public WebElement registerBtn(){
        return driver.findElement(By.id("register-button"));
    }
    public WebElement TextAfterRegister(){
        return driver.findElement(By.cssSelector("div[class=result]"));
    }
}
