package org.global;

import org.aeonbits.owner.ConfigCache;
import org.enums.Browser;
import org.enums.Platform;
import org.interfaces.AppEnvironment;

public class GlobalData {

    static {
        initGlobalData();
    }

    public static int DEFAULT_IMPLICITWAIT = 10;
    public static int DEFAULT_EXPLICITTWAIT = 10;
    public static final Browser BROWSER = Browser.getBrowser(System.getProperty("browser", ""));
    public static Platform PLATFORM= Platform.WEB;

    public static AppEnvironment plt = ConfigCache.getOrCreate(AppEnvironment.class);
    public static final String GROUP_NAMES = System.getProperty("groups", "");
    public static final String EXCLUDE_GROUPS = System.getProperty("excludegroup", "");





    private static void initGlobalData() {
        PLATFORM = Platform.WEB;
        System.out.println("platforn is "+PLATFORM);

        initCommonGlobalData();
//        switch (GlobalData.PLATFORM) {
//            case MWEB:
//                if (GlobalData.BROWSER == Browser.SAFARI) {
//                    initiOSGlobalData();
//                } else {
//                    initAndroidGlobalData();
//                }
//                break;
//
//            case ANDROID:
//               initAndroidGlobalData();
//                break;
//
//            case IOS:
//                initiOSGlobalData();
//                break;
//        }
        //GENERICFUNCTIONS = GenericFactory.getGenericFunctions();

    }


    private static void initCommonGlobalData() {
        if (System.getProperty("platform", "").length() > 0) {
            System.out.println("in platform if ");
            PLATFORM = Platform.getPlatform(System.getProperty("platform"));
        }
        else if (plt.PLATFORM().length() > 0)
            System.out.println("in platform else ");
            PLATFORM = Platform.getPlatform(plt.PLATFORM());
        System.out.println("in platform else ===>"+PLATFORM);

      /*  if (System.getProperty("incognitomode", "").length() > 0)
            INCOGNITO_MODE = Boolean.parseBoolean(System.getProperty("incognitomode"));
        else
            INCOGNITO_MODE = Boolean.parseBoolean(RESOURCE_BUNDLE.getString("INCOGNITO_MODE"));

        if (System.getProperty("capturenetworktraffic", "").length() > 0)
            FLAG_CAPTURENETWORKTRAFFIC = Boolean.parseBoolean(System.getProperty("capturenetworktraffic", "false"));
        else
            FLAG_CAPTURENETWORKTRAFFIC = Boolean.parseBoolean((RESOURCE_BUNDLE.getString("CAPTURE_NETWORK_TRAFFIC")));

        if (System.getenv("NODE_PATH") != null)
            NODE_PATH = System.getenv("NODE_PATH");
        else
            NODE_PATH = RESOURCE_BUNDLE.getString("NODE_PATH");

        if (System.getenv("APPIUM_JS_FILE") != null)
            APPIUM_JS_FILE_PATH = System.getenv("APPIUM_JS_FILE");
        else
            APPIUM_JS_FILE_PATH = RESOURCE_BUNDLE.getString("APPIUM_JS_FILE");

        if (GlobalData.PLATFORM == Platform.ANDROID)
            APP_COMPLETE_PATH = APP_PATH + "/" + APP_FILE_NAME;
        else
            APP_COMPLETE_PATH = APP_PATH + "/" + APP_FILE_NAME_IOS;

        System.out.println("Platform = " + PLATFORM.toString());
        if (GlobalData.PLATFORM != Platform.WEB) {
            System.out.println("Node Path = " + NODE_PATH);
            System.out.println("AppiumJS Path = " + APPIUM_JS_FILE_PATH);
            System.out.println("App Path = " + APP_COMPLETE_PATH);
        }
        System.out.println("Environment = " + ENVIRONMENT);
        System.out.println("Execution_Type = " + EXECUTION_TYPE);
        System.out.println("Language = " + LANGUAGE);
        if (GlobalData.PLATFORM == Platform.WEB || GlobalData.PLATFORM == Platform.RABAB)
            System.out.println("Incognito_Mode = " + INCOGNITO_MODE);
*/

        if (GROUP_NAMES.length() > 0)
            System.out.println("Group_Names = " + GROUP_NAMES);

        if (EXCLUDE_GROUPS.length() > 0)
            System.out.println("Excluded_Group_Names = " + EXCLUDE_GROUPS);
    }



}
