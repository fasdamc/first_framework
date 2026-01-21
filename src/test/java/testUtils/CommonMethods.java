package testUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDateTime;

import static testUtils.WebDriverUtils.driver;

public class CommonMethods {

    /**
     * Use this method to sleep for a given time
     * @param time
     */
    public static void sleep(int time) {
        try {
            Thread.sleep(time);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void selectDropDownValueByVisibleText(WebElement dropDownElement, String visibleText) {
        Select select = new Select(dropDownElement);
        select.selectByVisibleText(visibleText);
    }

    public static void selectDateByJS(WebElement element, String date) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value', ' " + date + " ');", element);
    }

    public static void waitForURLToBe(int timeInSeconds, String URL) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSeconds));
        wait.until(ExpectedConditions.urlToBe(URL));
    }
    public static String getCurrentDateWithFormat() {
        return LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
    }
}
