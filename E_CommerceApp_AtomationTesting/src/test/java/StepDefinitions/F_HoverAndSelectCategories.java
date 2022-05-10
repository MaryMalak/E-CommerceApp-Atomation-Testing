package StepDefinitions;

import Pages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class F_HoverAndSelectCategories {
    HomePage homePage=new HomePage();
    String Categ;
    String subCateg;

    @When("user Select random category \\({string}) then hover and open sub-Category if found \\({string})")
    public void SelectRandomCategory(String category, String subCategory) {
        Categ=category.toLowerCase() ;
        subCateg=subCategory.toLowerCase();
        homePage.menuOfCategories(Categ).click();
        homePage.menuOfSubCategories(subCateg).click();

    }

    @Then("user could hover and select different Categories successfully")
    public void userSelectCategorySuccessfully() {
        String expectedResult=subCateg;
        String actualResult=homePage.pageTitle().getText().toLowerCase();
        Assert.assertTrue(actualResult.contains(expectedResult));
    }


}
