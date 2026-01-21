package testUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.time.Duration;

public class WebDriverUtils {

    public static WebDriver driver;

    /**
     * THIS METHOD STARTS THE WebDriver
     */
    public static void start() {

        if (TestProperties.browser.equalsIgnoreCase("Chrome")) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--incognito");
            if (TestProperties.headless) {
                // Use headless flags compatible with modern Chromium-based browsers
                options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
            }
            driver = new ChromeDriver(options);
        } else if (TestProperties.browser.equalsIgnoreCase("Edge")) {
            EdgeOptions options = new EdgeOptions();
            options.addArguments("--inprivate");
            if (TestProperties.headless) {
                options.addArguments("--headless=new");
                options.addArguments("--disable-gpu");
                options.addArguments("--no-sandbox");
            }
            driver = new EdgeDriver(options);
        } else {
            throw new RuntimeException("* * * BROWSER NOT SUPPORTED * * *");
        }

        // In headless mode maximize() may not have the expected effect, ensure a set size instead
        if (TestProperties.headless) {
            driver.manage().window().setSize(new Dimension(1920, 1080));
        } else {
            driver.manage().window().maximize();
        }
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * THIS METHOD QUITS THE WebDriver
     */
    public static void stop() {
            driver.quit();
    }
}
