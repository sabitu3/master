/*
package org.web;


import com.constants.Constants;
import com.driverInstance.DriverManager;
import com.enums.Browser;
import com.enums.LogLevel;
import com.executionobjects.DeviceDetails;
import com.global.GlobalData;
import com.listeners.ExceptionListener;
import com.utils.GenericFunctions;
import io.appium.java_client.events.EventFiringWebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GenericFunctionsWeb<E> extends GenericFunctions {
    private Iterator<E> iterator;


    public GenericFunctionsWeb() {
       // iterator = LoginProvider.getUserIterator();
    }

    @Override
    public void initAppiumServers_Drivers(LogLevel appiumLogLevel) throws Exception {

    }

    @Override
    public void closeAppAllDevices() {

    }

    @Override
    public void downloadApp(String urlString) throws Exception {

    }

    @Override
    public void killAppiumServers() {

    }

    @Override
    public int getNoOfDevicesConnected() {
        return 0;
    }

    @Override
    public void installApp(String deviceID) throws Exception {

    }

    @Override
    public void uninstallApp(String deviceID) throws Exception {

    }

    @Override
    public List<String> getConnectedDeviceSerialIDs() throws IOException {
        return null;
    }

    @Override
    public void uninstallAppAllDevices() throws Exception {

    }

    @Override
    public void installAppAllDevices() throws Exception {

    }

    @Override
    public List<DeviceDetails> getConnectedDeviceDetailsList() throws IOException {
        return null;
    }

    @Override
    public String getDeviceVersion(String deviceID) throws IOException {
        return null;
    }

    @Override
    public String getDeviceName(String deviceID) throws IOException {
        return null;
    }

    @Override
    public boolean checkAppInstalled(String deviceID) throws IOException {
        return false;
    }

    @Override
    public void downloadAndInstallApp() {

    }

    @Override
    public String getAppVersion() {
        return null;
    }

    @Override
    public void initRemoteMachines() {

    }

    public void startDriver(Browser browser) {
        WebDriver driver = null;
        switch (browser) {

            case CHROME:
                System.out.println("--------Starting Chrome Driver-------");
                WebDriverManager.chromedriver().setup();
                ChromeOptions option = new ChromeOptions();
                if(GlobalData.INCOGNITO_MODE){
                    System.out.println("-------Started Incognito Mode-------");
                  option.addArguments("--incognito");
                  driver = new ChromeDriver(option);
                 }
                else
                driver = new ChromeDriver();
                driver.manage().window().maximize();
                break;

            case CHROMEHEADLESS:
                System.out.println("--------Starting Chrome Headless Driver-------");
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.setHeadless(true);
                chromeOptions.addArguments("--start-fullscreen");
                chromeOptions.addArguments("--no-sandbox");
                chromeOptions.addArguments("--disable-gpu");
                chromeOptions.addArguments("--disable-dev-shm-usage");
                chromeOptions.addArguments("--disable-infobars");
                chromeOptions.addArguments("--disable-browser-side-navigation");
                chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                driver = new ChromeDriver(chromeOptions);
                break;

            case FIREFOX:
                System.out.println("--------Starting Firefox Driver-------");
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;

            case FIREFOXHEADLESS:
                System.out.println("--------Starting Firefox Headless Driver-------");
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(true);
                firefoxOptions.addArguments("window-size=1920x1080");
                driver = new FirefoxDriver(firefoxOptions);
                break;
        }
        driver.manage().timeouts().implicitlyWait(GlobalData.DEFAULT_IMPLICITWAIT, TimeUnit.SECONDS);
        DriverManager.getDriver().get(Constants.UrlConstants.ZEE5_URL);

        driver = EventFiringWebDriverFactory.getEventFiringWebDriver(driver, new ExceptionListener());
        //return driver;

    }

    public synchronized void restartFreshDriver() {
        System.out.println("------ Restarting Fresh Driver for Logout Case ------");
        DriverManager.unload();
       // WebDriver driver = startDriver(GlobalData.BROWSER);
       /// DriverManager.setDriver(driver);
    }

}*/
