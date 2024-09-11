package org.tests;

import org.constants.FrameworkConstants;
import org.driver.Driver;
import org.driver.DriverManager;
import org.enums.Platform;
import org.global.GlobalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.utils.ReadPropertyFile;
import org.web.BrowserManager;

import java.io.IOException;
import java.net.MalformedURLException;
import java.time.Duration;

import static org.global.GlobalData.PLATFORM;
import static org.global.GlobalData.plt;

public class BaseTest {

    protected BaseTest(){

    }

    @BeforeMethod
    protected void setUp() throws Exception {
        initApplication();
       /* DriverManager.getDriver().get(ReadPropertyFile.get("url"));
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));*/

    }

    private void initApplication() throws MalformedURLException {
        switch (PLATFORM) {
            case ANDROID:
                break;

            case IOS:
                break;

            case MWEB:
                //  if (INFRA.equalsIgnoreCase("local"))
                BrowserManager.LaunchMobileBrowserGrid(GlobalData.BROWSER);

                break;
            case WEB:
                BrowserManager.startDriver(GlobalData.BROWSER);

           /* case RABAB:
                if (INFRA.equalsIgnoreCase(Constants.INFRA_EC2)) {
                    BrowserManager.LaunchBrowserGrid(GlobalData.BROWSER);
                } else {
                    BrowserManager.startDriver(GlobalData.BROWSER);
                }*/
            case API:
                break;

            default:

        }
    }


    @AfterMethod
    protected void tearDown(){
       Driver.quitDriver();
    }
}
