package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login extends Page {

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[1]/h1")
    private WebElement welcomeText;

    @FindBy(id = "username")
    private WebElement fieldUsername;

    @FindBy(id = "password")
    private WebElement fieldPassword;

    @FindBy(id = "customCheck")
    private WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/div[3]/div/label")
    private WebElement checkBoxLabelRememberMe;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/button")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[2]/a")
    private WebElement buttonForgotPassword;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[1]")
    private WebElement imageLogin;

    @FindBy(xpath = "//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[3]/a")
    private WebElement buttonRegistration;

    public WebElement getAlertWrongLoginOrPassword() {
        return alertWrongLoginOrPassword;
    }

    @FindBy(xpath="//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/div[2]")
	private WebElement alertWrongLoginOrPassword;

	@FindBy(xpath="//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/div[1]/div")
	private WebElement alertInvalidUsernameLength;

	@FindBy(xpath="//*[@id='page-top']/div/div/div/div/div/div/div[2]/div/form/div[2]/div")
	private WebElement alertInvalidPasswordLength;

    public WebElement getAlertInvalidUsernameLength() {
        return alertInvalidUsernameLength;
    }

    public WebElement getAlertInvalidPasswordLength() {
        return alertInvalidPasswordLength;
    }

    public Login(WebDriver driver) {
        super(driver);
    }

    public WebElement getButtonRegistration() {
        return buttonRegistration;
    }

    public WebElement getWelcomeText() {
        return welcomeText;
    }

    public WebElement getFieldUsername() {
        return fieldUsername;
    }

    public WebElement getFieldPassword() {
        return fieldPassword;
    }

    public WebElement getCheckBoxRememberMe() {
        return checkBoxRememberMe;
    }

    public WebElement getCheckBoxLabelRememberMe() {
        return checkBoxLabelRememberMe;
    }

    public WebElement getButtonLogin() {
        return buttonLogin;
    }

    public WebElement getButtonForgotPassword() {
        return buttonForgotPassword;
    }

    public WebElement getImageLogin() {
        return imageLogin;
    }
}
