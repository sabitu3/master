package org.driver;

import org.constants.FrameworkConstants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public final class Driver {

    private Driver(){

    }

    //private static WebDriver driver;



    public static void initDriver(){
        if(Objects.isNull(DriverManager.getDriver())){
            System.setProperty("webdriver.chrome.driver", FrameworkConstants.getChromeDriverPath());
            DriverManager.setDriver(new ChromeDriver());

        }

    }

    public static void quitDriver(){
        if(Objects.nonNull(DriverManager.getDriver())){
            DriverManager.getDriver().quit();
            DriverManager.unload();
        }


    }
}
