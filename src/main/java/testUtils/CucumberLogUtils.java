package testUtils;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CucumberLogUtils {
    public static Scenario scenario;

    public static void logScreenshot(){
        final byte[] screenshot = ((TakesScreenshot) WebDriverUtils.driver).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot, "image/png", "Attaching screenshot to report");
    }
}
