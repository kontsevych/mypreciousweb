package com.mypreciousweb.config;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    public static Properties property = null;

    public static void configSetup() {
        try {
            property = new Properties();
            FileInputStream fis = new FileInputStream("src/main/resources/config.properties");
            property.load(fis);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String loginPageURL() {
        return getPathDomain() + property.getProperty("page.login");
    }

    public static String registrationPageURL() {
        return getPathDomain() + property.getProperty("page.register");
    }

    public static String pathDriverChrome() {
        return property.getProperty("pathDriverChrome");
    }

    public static String pathDriverChromeWindows() {
        return property.getProperty("pathDriverChromeWindows");
    }

    public static String setNameWebdriverChromeDriver() {
        return property.getProperty("pathWebdriverChromeDriver");
    }

    public static String getPathDomain() {
        return property.getProperty("pathDomain");
    }

    public static String getUsername() {
        return property.getProperty("username");
    }

    public static String getPassword() {
        return property.getProperty("password");
    }

    public static String getPageDashboard() {
        return property.getProperty("page.dashboard");
    }

    public static String getAlertLoginUsernameLength() {
        return property.getProperty("alertLoginUsernameLength");
    }

    public static String getAlertLoginPasswordLength() {
        return property.getProperty("alertLoginPasswordLength");
    }

    public static String getLabelLoginTextWelcomeBack() {
        return property.getProperty("labelLoginTextWelcomeBack");
    }

    public static String getLabelLoginTextRememberMe() {
        return property.getProperty("labelLoginTextRememberMe");
    }

    public static String getLabelLoginFieldUsername() {
        return property.getProperty("labelLoginFieldUsername");
    }

    public static String getLabelLoginFieldPassword() {
        return property.getProperty("labelLoginFieldPassword");
    }

    public static String getAlertLoginWrongUsernameOrPassword() {
        return property.getProperty("alertLoginWrongUsernameOrPassword");
    }

    public static String getLabelLoginButtonForgotPassword() {
        return property.getProperty("labelLoginButtonForgotPassword");
    }

    public static String getLabelLoginButtonLogin() {
        return property.getProperty("labelLoginButtonLogin");
    }

    public static String getLabelLoginButtonRegistration() {
        return property.getProperty("labelLoginButtonRegistration");
    }

    public static String getLabelRegisterFieldUsername() {
        return property.getProperty("labelRegisterFieldUsername");
    }

    public static String getLabelRegisterFieldPassword() {
        return property.getProperty("labelRegisterFieldPassword");
    }

    public static String getLabelRegisterFieldRepeatPassword() {
        return property.getProperty("labelRegisterFieldRepeatPassword");
    }

    public static String getLabelRegisterFieldEmail() {
        return property.getProperty("labelRegisterFieldEmail");
    }

    public static String getLabelRegisterFieldName() {
        return property.getProperty("labelRegisterFieldName");
    }

    public static String getLabelRegisterFieldLastName() {
        return property.getProperty("labelRegisterFieldLastName");
    }

    public static String getLabelRegisterButtonRegister() {
        return property.getProperty("labelRegisterButtonRegister");
    }

    public static String getLabelRegister() {
        return property.getProperty("labelRegisterTop");
    }

    public static String getLabelForgotPasswordTop() {
        return property.getProperty("labelForgotPasswordTop");
    }

    public static String getLabelForgotPasswordFieldEmail() {
        return property.getProperty("labelForgotPasswordFieldEmail");
    }

    public static String getLabelForgotPasswordButtonResetPassword() {
        return property.getProperty("labelForgotPasswordButtonResetPassword");
    }

    public static String getLabelForgotPasswordButtonRegister() {
        return property.getProperty("labelForgotPasswordButtonRegister");
    }

    public static String getLabelForgotPasswordButtonLogin() {
        return property.getProperty("labelForgotPasswordButtonLogin");
    }

    public static String getLabelDashboardTopMyPrecious() {
        return property.getProperty("labelDashboardTopMyPrecious");
    }

    public static String getLabelDashboardTopAlpha() {
        return property.getProperty("labelDashboardTopAlpha");
    }

    public static String getLabelDashboardBoard() {
        return property.getProperty("labelDashboardBoard");
    }

    public static String getLabelDashboardMoney() {
        return property.getProperty("labelDashboardMoney");
    }

    public static String getLabelDashboardTransactions() {
        return property.getProperty("labelDashboardTransactions");
    }

    public static String getLabelDashboardSystem() {
        return property.getProperty("labelDashboardSystem");
    }

    public static String getLabelDashboardCategories() {
        return property.getProperty("labelDashboardCategories");
    }

    public static String getLabelDashboardSettings() {
        return property.getProperty("labelDashboardSettings");
    }

    public static String getLabelDashboardTemplates() {
        return property.getProperty("labelDashboardTemplates");
    }

    public static String getLabelDashboardСurrency() {
        return property.getProperty("labelDashboardСurrency");
    }

    public static String getLabelDashboardAddTransactionButton() {
        return property.getProperty("labelDashboardAddTransactionButton");
    }

    public static String getLabelDashboardToday() {
        return property.getProperty("labelDashboardToday");
    }

    public static String getLabelDashboardWeek() {
        return property.getProperty("labelDashboardWeek");
    }

    public static String getLabelDashboardMonth() {
        return property.getProperty("labelDashboardMonth");
    }

    public static String getLabelDashboardYears() {
        return property.getProperty("labelDashboardYears");
    }

}
