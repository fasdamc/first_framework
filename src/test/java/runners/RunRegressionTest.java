package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = "html:target/cucumber-reports/Regression-Test-Report.html",
        glue = {"steps", "hooks"},
        dryRun = false,
        tags = "@Regression2"
)

public class RunRegressionTest extends AbstractTestNGCucumberTests {
}
