package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static testUtils.WebDriverUtils.driver;

public class SignInPage {

    @FindBy(xpath = "//input[@placeholder='Username']")
    public WebElement usernameTextBox;

    @FindBy(xpath = "//input[@placeholder='Password']")
    public WebElement passwordTextBox;

    @FindBy(xpath = "//button[normalize-space()='Sign In']")
    public WebElement signInButton;

    public SignInPage() {
        PageFactory.initElements(driver, this);
    }
}
