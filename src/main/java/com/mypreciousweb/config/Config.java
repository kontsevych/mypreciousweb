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
        return property.getProperty("domain") + property.getProperty("page.login");
    }

    public static String registrationPageURL() {
        return property.getProperty("domain") + property.getProperty("page.registration");
    }

    public static String driverChrome(){
        return property.getProperty("driverChrome");
    }

}
