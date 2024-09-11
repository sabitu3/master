package org.interfaces;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/environment/appenvironment.properties"
})
public interface AppEnvironment extends Config {
    /**
     * APPIUM ENVIRONMENT
     */
    String INFRA();

    String JAVA_HOME();

    String ANDROID_HOME();

    String NODE_JS_PATH();

    String APPIUM_JS_PATH();

    String LOCAL_MACHINE_IP();

    String APPIUM_LAUNCH_IP_LOCAL();

    String APPIUM_LAUNCH_IP_REMOTE();

    int APPIUM_LAUNCH_PORT();

    long APPIUM_STARTUP_TIMEOUT_IN_MILLI();

    long DEFAULT_IMPLICIT_WAIT_IN_MILLI();

    String APPIUM_LOG_LEVEL();

    boolean RELAXED_SECURITY();

    String APPIUM_REMOTE_PATH();

    String PLATFORM();

    /**
     * ANDROID ENVIRONMENT
     */

    boolean SIM_FLAG_ANDROID();

    String ADB_PATH();

    String APP_PACKAGE();

    String APP_ACTIVITY();

    String AUTOMATION_NAME_ANDROID();

    boolean NO_RESET_ANDROID();

    boolean FULL_RESET_ANDROID();

    boolean AUTO_WEB_VIEW_ANDROID();

    boolean AUTO_GRANT_PERMISSIONS_ANDROID();

    long NEW_COMMAND_TIMEOUT_IN_MILLI_ANDROID();

    /**
     * IOS ENVIRONMENT
     */

    boolean SIM_FLAG_IOS();

    String UDID();

    String BUNDLE_ID();

    String BUNDLE_ID_TESTFLIGHT();

    String APP_PATH_IOS();

    String DEVICE_NAME_IOS();

    String PLATFORM_VERSION_IOS();

    String BROWSER_NAME_IOS();

    String NEW_COMMAND_TIMEOUT_IN_MILLI_IOS();


    boolean USE_NEW_WDA();

    boolean USE_PREBUILT_WDA();

    String WEB_DRIVER_AGENT_URL();

    int WDA_LOCAL_PORT();

    String XCODE_ORG_ID();

    String XCODE_SIGNING_ID();

    boolean NO_RESET_IOS();

    boolean FULL_RESET_IOS();

    boolean AUTO_WEB_VIEW_IOS();

    boolean AUTO_ACCEPT_ALERTS_IOS();

    boolean AUTO_DISMISS_ALERTS_IOS();

    boolean SHOW_XCODE_LOG();

    boolean SHOW_IOS_LOG();

    String APP_COMPLETE_PATH_ZIP_IOS();

    String LANGUAGE_IOS();

    String APPIUM_JAVA_DOWNGRADE7();
}
