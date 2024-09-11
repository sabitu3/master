package org.enums;

public enum Platform {
    IOS, ANDROID, MWEB, WEB,TV,API,RABAB;

    public static Platform getPlatform(String platform) {
        switch (platform.toLowerCase()) {
            case "android":
                return Platform.ANDROID;

            case "mweb":
                return Platform.MWEB;

            case "ios":
                return Platform.IOS;

            case "web":
                return Platform.WEB;

            case "TV":
                return Platform.TV;

            case "api":
                return Platform.API;

            case "rabab":
                return Platform.RABAB;
        }

        return null;
    }
}
