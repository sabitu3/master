package org.tests;

import org.constants.FrameworkConstants;
import org.driver.Driver;
import org.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utils.ReadPropertyFile;

import java.time.Duration;

public final class LoginPageTest extends BaseTest {

    private LoginPageTest(){

    }

    @Test
    public void LoginTest() throws Exception {

        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+)
        DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        Thread.sleep(3000);
        DriverManager.getDriver().navigate().to("https://www.google.com/");
        Thread.sleep(2000);
        DriverManager.getDriver().get("https://www.geeksforgeeks.org/");

//        DriverManager.getDriver().findElement(By.xpath("//div[@id='navbarSupportedContent']//a[text()='Try Free']")).click();
//        DriverManager.getDriver().findElement(By.xpath("//input[@name='email']")).sendKeys("sabitu3@gmail.com");
//        DriverManager.getDriver().findElement(By.xpath("//input[@name='password']")).sendKeys("SabituGaut@m#123$");
//        DriverManager.getDriver().findElement(By.xpath("//button[@data-test-id='create-account-form-button']")).click();
    }





}
