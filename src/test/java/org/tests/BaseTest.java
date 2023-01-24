package org.tests;

import org.constants.FrameworkConstants;
import org.driver.Driver;
import org.driver.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.utils.ReadPropertyFile;

import java.io.IOException;
import java.time.Duration;

public class BaseTest {

    protected BaseTest(){

    }

    @BeforeMethod
    protected void setUp() throws Exception {
        Driver.initDriver();
        DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

    }

    @AfterMethod
    protected void tearDown(){
       Driver.quitDriver();
    }
}
