package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testUtils.WebDriverUtils.driver;

public class DashboardPage {
    @FindBy(xpath = "//span[normalize-space()='Student Information']")
    public WebElement studentInformationMenu;

    @FindBy(xpath = "//a[normalize-space()='Student Admission']")
    public WebElement studentAdmissionMenu;

    public DashboardPage() {
        PageFactory.initElements(driver, this);
    }
}
