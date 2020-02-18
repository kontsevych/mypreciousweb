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
        return property.getProperty("pathDomain") + property.getProperty("page.login");
    }

    public static String registrationPageURL() {
        return property.getProperty("pathDomain") + property.getProperty("page.registration");
    }

    public static String pathDriverChrome(){
        return property.getProperty("pathDriverChrome");
    }

    public static String pathDriverChromeWindows(){
        return property.getProperty("pathDriverChromeWindows");
    }

    public static String pathWebdriverChromeDriver(){
        return property.getProperty("pathWebdriverChromeDriver");
    }

}
