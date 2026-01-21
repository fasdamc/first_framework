package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        plugin = "html:target/cucumber-reports/Smoke_Test_Report.html",
        glue = {"steps", "hooks"},
        dryRun = false,
        tags = "@Smoke"
)

public class RunSmokeTest extends AbstractTestNGCucumberTests {
}
