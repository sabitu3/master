package org.constants;

public class FrameworkConstants {

    private static final String RESOURCESPATH= System.getProperty("user.dir")+"\\src\\test\\resources";
    private static final String CHROMEDRIVERPATH= RESOURCESPATH+"\\executables\\chromedriver.exe";
    private static final String CONFIGFILEPATH= RESOURCESPATH+"\\config\\config.properties";

    private static final String URL= "";

    private FrameworkConstants(){

    }

    public static String getChromeDriverPath() {
        System.out.println("Driver path is "+CHROMEDRIVERPATH);
        System.out.println("resource  path is "+RESOURCESPATH);
        return CHROMEDRIVERPATH;
    }

    public static String getConfigFilePath() {
        return CONFIGFILEPATH;
    }
}
