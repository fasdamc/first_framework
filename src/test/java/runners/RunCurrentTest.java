package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = "html:target/cucumber-reports/Current-Test-Report.html",
        glue = {"steps", "hooks"},
        dryRun = false,
        tags = "@CurrentTest"
)

public class RunCurrentTest extends AbstractTestNGCucumberTests {
}
