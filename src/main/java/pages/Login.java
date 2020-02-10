package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    private WebDriver driver;
    private String loginPageURL = "https://mypreciousweb.herokuapp.com/login";

    @FindBy(xpath = "//*[@id=\\page-top\\]/div/div/div/div/div/div/div[2]/div/div[1]/h1")
    private WebElement welcomeText;

    @FindBy(xpath = "//*[@id=\\username\\]")
    private WebElement fieldUsername;

    @FindBy(xpath = "//*[@id=\\password\\]")
    private WebElement fieldPassword;

    @FindBy(xpath = "//*[@id=\\customCheck\\]")
    private WebElement checkBoxRememberMe;

    @FindBy(xpath = "//*[@id=\\page-top\\]/div/div/div/div/div/div/div[2]/div/form/div[3]/div/label")
    private WebElement checkBoxLabelRememberMe;

    @FindBy(xpath = "//*[@id=\\page-top\\]/div/div/div/div/div/div/div[2]/div/form/button")
    private WebElement buttonLogin;

    @FindBy(xpath = "//*[@id=\\page-top\\]/div/div/div/div/div/div/div[2]/div/div[2]/a")
    private WebElement buttonForgotPassword;

    @FindBy(xpath = "//*[@id=\"page-top\"]/div/div/div/div/div/div/div[1]")
    private WebElement imageLogin;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public WebDriver getDriver() {
        return driver;
    }

    public String getLoginPageURL() {
        return loginPageURL;
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
