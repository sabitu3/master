package org.tests;

import org.driver.Driver;
import org.driver.DriverManager;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;

public final class HomePageTest extends BaseTest {

    private HomePageTest(){

    }

    @Test
    public void LoginTest1(){

//        System.setProperty("webdriver.gecko.driver","C:\\Users\\SGTM\\IdeaProjects\\SeleniumPom\\src\\test\\resources\\executables\\geckodriver.exe");
//        WebDriver d = new FirefoxDriver();

        DriverManager.getDriver().get("https://www.elastic.co/guide/en/kibana/master/development-tests.html");
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
        DriverManager.getDriver().findElement(By.xpath("//div[@id='navbarSupportedContent']//a[text()='Try Free']")).click();


    }

//    @Test
//    public void LoginTest2(){
//
////        System.setProperty("webdriver.gecko.driver","C:\\Users\\SGTM\\IdeaProjects\\SeleniumPom\\src\\test\\resources\\executables\\geckodriver.exe");
////        WebDriver d = new FirefoxDriver();
//
//        DriverManager.getDriver().get("https://www.elastic.co/guide/en/kibana/master/development-tests.html");
//        DriverManager.getDriver().manage().window().maximize();
//        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
//        DriverManager.getDriver().findElement(By.xpath("//div[@id='navbarSupportedContent']//a[text()='Try Free']")).click();
//
//    }


}
