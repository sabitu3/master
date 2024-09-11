package org.enums;

import org.testng.annotations.Parameters;

/**
 * Enums to restrict the values used on Property files. Without using enums there can be null pointer exceptions happening
 * because of typos.
 * <p>
 * Whenever a new value is added to property file, corressponding enum should be created here.
 */
public enum Browser {
    CHROME, NATIVE, SAFARI, CHROMEHEADLESS, FIREFOX, FIREFOXHEADLESS;

    @Parameters("browser")
    public static Browser getBrowser(String browser) {
        switch (browser.toLowerCase()) {
            case "native":
                return NATIVE;
            case "safari":
                return SAFARI;
            case "chromeheadless":
                return CHROMEHEADLESS;
            case "firefox":
                return FIREFOX;
            case "firefoxheadless":
                return FIREFOXHEADLESS;
            default:
                return CHROME;
        }
    }
}
