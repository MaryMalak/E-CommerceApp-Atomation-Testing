package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class G_FollowUsStepDef {
    HomePage homePage=new HomePage();
    String acualResult1;
    String acualResult2;
    String acualResult3;
    String acualResult4;

    @When("user click on Facebook logo under follow us text")
    public void FollowUsFacebook(){
        homePage.FollowUsFacebookLogo().click();
        acualResult1=homePage.FollowUsFacebookLogo().getAttribute("href");
    }

    @And("user click on twitter logo under follow us text")
    public void FollowUsTwitter() {
        homePage.FollowUsTwitterLogo().click();
        acualResult2=homePage.FollowUsTwitterLogo().getAttribute("href");
    }

    @And("user click on RSS logo under follow us text")
    public void FollowUsRSS() throws InterruptedException {
        homePage.FollowUsRSSLogo().click();
        acualResult3=Hooks.driver.getCurrentUrl();
        Hooks.driver.navigate().back();

    }

    @And("user click on youtube logo under follow us text")
    public void FollowUsYoutube() {
        homePage.FollowUsYoutubeLogo().click();
        acualResult4=homePage.FollowUsYoutubeLogo().getAttribute("href");
    }

    @Then("'Follow us' links open the corresponding website successfully")
    public void followUsLinksWorkedSuccessfully() {
        String expectedResult1="http://www.facebook.com/nopCommerce";
        String expectedResult2="https://twitter.com/nopCommerce";
        String expectedResult3="https://demo.nopcommerce.com/news/rss/1";
        String expectedResult4="http://www.youtube.com/user/nopCommerce";
        Assert.assertTrue(expectedResult1.contains(acualResult1));
        Assert.assertTrue(expectedResult2.contains(acualResult2));
        Assert.assertTrue(expectedResult3.contains(acualResult3));
        Assert.assertTrue(expectedResult4.contains(acualResult4));

    }
}
