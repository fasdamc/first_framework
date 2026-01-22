package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import testUtils.CucumberLogUtils;

import static testUtils.WebDriverUtils.start;
import static testUtils.WebDriverUtils.stop;

public class Hooks {

    @Before
    public void startTest(Scenario scenario){
        CucumberLogUtils.scenario = scenario;
        start();
    }

    @After
    public void stopTest(){
        stop();
    }

    // Take screenshot after each step
    @AfterStep
    public void logScreenshot(){
        CucumberLogUtils.logScreenshot();
    }
}
