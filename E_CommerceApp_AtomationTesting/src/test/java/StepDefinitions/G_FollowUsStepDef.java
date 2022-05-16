package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.lang.reflect.Array;
import java.util.Set;

public class G_FollowUsStepDef {
    HomePage homePage=new HomePage();
    String acualResult1;
    String acualResult2;
    String acualResult3;
    String acualResult4;

    @When("user click on Facebook logo under follow us text")
    public void FollowUsFacebook(){
        homePage.FollowUsFacebookLogo().click();
    }

    @Then("{string} is opened in new tab")
    public void isOpenedInNewTab(String facebookLink) {
        String expectedResult=facebookLink;
        String [] w =Hooks.driver.getWindowHandles().toArray(new String[Hooks.driver.getWindowHandles().size()]);
        if (w.length>1)
            Hooks.driver.switchTo().window(w[1]);
        String acualResult=Hooks.driver.getCurrentUrl();
        Assert.assertEquals(expectedResult,acualResult);
    }
    @When("user click on twitter logo under follow us text")
    public void FollowUsTwitter() {
        homePage.FollowUsTwitterLogo().click();
    }

    @When("user click on RSS logo under follow us text")
    public void FollowUsRSS()  {
        homePage.FollowUsRSSLogo().click();
    }

    @When("user click on youtube logo under follow us text")
    public void FollowUsYoutube() {
        homePage.FollowUsYoutubeLogo().click();
    }


}
