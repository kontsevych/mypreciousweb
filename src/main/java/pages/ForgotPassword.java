package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword extends Page{

    @FindBy(id = "page-top")
    private WebElement labelResetYourPassword;

    @FindBy(id = "email")
    private WebElement fieldEmail;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/button")
    private WebElement buttonResetYourPassword;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[3]/a")
    private WebElement buttonLogin;

    public ForgotPassword(WebDriver driver) {
        super(driver);
    }

    public WebElement getLabelResetYourPassword() {
        return labelResetYourPassword;
    }

    public WebElement getFieldEmail() {
        return fieldEmail;
    }

    public WebElement getButtonResetYourPassword() {
        return buttonResetYourPassword;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }
}
