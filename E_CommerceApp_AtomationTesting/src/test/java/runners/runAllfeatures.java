package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "src/main/resources/Features",
        glue = "StepDefinitions",
        plugin = {"pretty",
        "html:target/cucumber.html"},
        tags = "@regressionTest"



)

public class runAllfeatures {

}
