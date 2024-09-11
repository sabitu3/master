package org.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.driver.DriverManager;
import org.enums.Browser;
import org.global.GlobalData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import static org.global.GlobalData.BROWSER;

public class BrowserManager {

/*
    public static synchronized void LaunchBrowserGrid(Browser browserName) throws MalformedURLException {
        if (BROWSER.equals(Browser.FIREFOX)) {

        } else if (BROWSER.equals(Browser.CHROME)) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-fullscreen");
            //options.addArguments("start-maximized");
            //options.addArguments("--headless");
            //	options.addArguments("window-size=1440, 795");
            options.addArguments("enable-automation");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-browser-side-navigation");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-browser-side-navigation");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.addArguments("--remote-allow-origins=*");
			*/
/*options.setCapability("se:recordVideo", true);
			options.setCapability("se:timeZone", "US/Pacific");
			options.setCapability("se:name", "Sample test");
			options.setCapability("platformName", "linux");
			options.setCapability("se:screenResolution", "1920x1080");
*//*

            DriverManager.setDriver(new RemoteWebDriver(new URL(Constants.UrlConstants.AMAZON_LINUX_GRID), options));
        } else if (BROWSER.equals(Browser.SAFARI)) {
            DriverManager.setDriver(WebDriverManager.safaridriver().browserInDocker().create());
        }
        if (APIENV.equals("qc")) {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_QC_URL);
        } else {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_UAT_URL);
        }
        DriverManager.getDriver().manage().timeouts().implicitlyWait(GlobalData.DEFAULT_IMPLICITWAIT, TimeUnit.SECONDS);
    }
*/

    public static WebDriver startDriver(Browser browser) {
        switch (browser) {

            case CHROME:
                System.out.println("--------Starting Chrome Driver-------");
                WebDriverManager.chromedriver().setup();
                ChromeOptions options = new ChromeOptions();
                options.addArguments("--start-fullscreen");
                options.addArguments("start-maximized");
                options.addArguments("enable-automation");
                options.addArguments("--no-sandbox");
                options.addArguments("--disable-gpu");
                options.addArguments("--disable-dev-shm-usage");
                options.addArguments("--disable-infobars");
                options.addArguments("--disable-notifications");
                options.addArguments("--disable-browser-side-navigation");
                options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                options.addArguments("--remote-allow-origins=*");
                options.setCapability("goog:chromeOptions", options);
                /*if (GlobalData.INCOGNITO_MODE) {
                    System.out.println("-------Started Incognito Mode-------");
                    options.addArguments("--incognito");
                    DriverManager.setDriver(new ChromeDriver(options));
                } else*/
                DriverManager.setDriver(new ChromeDriver(options));
                break;

            case CHROMEHEADLESS:
                try {
                    System.out.println("--------Starting Chrome Headless Driver-------");
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setHeadless(true);
                    chromeOptions.addArguments("--start-fullscreen");
                    chromeOptions.addArguments("--window-size=1920,1080");
                    chromeOptions.addArguments("--start-maximized");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-gpu");
                    chromeOptions.addArguments("--disable-dev-shm-usage");
                    chromeOptions.addArguments("--disable-infobars");
                    chromeOptions.addArguments("--disable-notifications");
                    chromeOptions.addArguments("--disable-browser-side-navigation");
                    chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                    chromeOptions.addArguments("--remote-allow-origins=*");
                    //username password is fixed and will not change
                    DriverManager.setDriver(new ChromeDriver(chromeOptions));
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;

            case FIREFOX:
                System.out.println("--------Starting Firefox Driver-------");
                WebDriverManager.firefoxdriver().setup();
                DriverManager.setDriver(new FirefoxDriver());
                DriverManager.getDriver().manage().window().maximize();
                break;

            case FIREFOXHEADLESS:
                System.out.println("--------Starting Firefox Headless Driver-------");
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                firefoxOptions.setHeadless(true);
                firefoxOptions.addArguments("window-size=1920x1080");
                DriverManager.setDriver(new FirefoxDriver(firefoxOptions));
                break;

            case SAFARI:
                DriverManager.setDriver(new SafariDriver());
                DriverManager.getDriver().manage().window().maximize();
                break;
        }
       /* if (APIENV.equals("qc")) {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_QC_URL);

        } else if (APIENV.equals("prod")) {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_PROD_URL);

        } else {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_UAT_URL);
        }*/
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(GlobalData.DEFAULT_IMPLICITWAIT));
        return DriverManager.getDriver();
    }

    public static synchronized void LaunchMobileBrowserGrid(Browser browserName) {
        if (BROWSER.equals(Browser.FIREFOX)) {

        } else if (BROWSER.equals(Browser.CHROME)) {
            /*Map<String, Object> deviceMetrics = new HashMap<String, Object>() ;
            deviceMetrics.put("width", 560);
            deviceMetrics.put("height", 640);
            deviceMetrics.put("pixelRatio", 4.0);*/
            WebDriverManager.chromedriver().setup();
            Map<String, String> mobileEmulation = new HashMap<>();
            mobileEmulation.put("deviceName", "Pixel 2 XL");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("start-maximized");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-gpu");
            options.addArguments("--disable-dev-shm-usage");
            options.addArguments("--disable-infobars");
            options.addArguments("--disable-notifications");
            options.addArguments("--disable-browser-side-navigation");
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            options.setExperimentalOption("mobileEmulation", mobileEmulation);
            DriverManager.setDriver(new ChromeDriver(options));
        } else if (BROWSER.equals(Browser.SAFARI)) {

        }
      /*  if (APIENV.equals("qc")) {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_QC_URL);
        } else {
            DriverManager.getDriver().get(Constants.UrlConstants.RABAB_UAT_URL);
        }*/
        DriverManager.getDriver().manage().timeouts().implicitlyWait(GlobalData.DEFAULT_IMPLICITWAIT, TimeUnit.SECONDS);
    }


}