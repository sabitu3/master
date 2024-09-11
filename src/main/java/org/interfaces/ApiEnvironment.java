package org.interfaces;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources(
        {"system:properties",
                "system:env",
                "file:${user.dir}/src/test/resources/environment/prod.properties",
                "file:${user.dir}/src/test/resources/environment/qc.properties",
                "file:${user.dir}/src/test/resources/environment/stage.properties",
                "file:${user.dir}/src/test/resources/environment/uat.properties",
                "file:${user.dir}/src/test/resources/environment/preprod.properties"
        })
public interface ApiEnvironment extends Config {


    @DefaultValue("prod")
    String env();

    @DefaultValue("aws")
    String cloud();

    @Key("${env}.${cloud}.testEnable")
    boolean testEnable();

    @Key("${env}.${cloud}.BaseUrl_RecommendationApi")
    String BaseUrl_RecommendationApi();

    @Key("${env}.${cloud}.BaseUrl_RecoApi_Seo_Content")
    String BaseUrl_RecoApi_Seo_Content();

    @Key("${env}.${cloud}.BaseUrl_RecoApi_CRS")
    String BaseUrl_RecoApi_CRS();

    @Key("${env}.${cloud}.BaseUrl_CampaignApi")
    String BaseUrl_CampaignApi();

    @Key("${env}.${cloud}.BaseUrl_olmorderapi")
    String BaseUrl_olmorderapi();

    @Key("${env}.${cloud}.BaseUrl_olmpackentapi")
    String BaseUrl_olmpackentapi();

    @Key("${env}.${cloud}.BaseUrl_olmplanmanagementapi")
    String BaseUrl_olmplanmanagementapi();

    @Key("${env}.${cloud}.BaseUrl_olmorderbffapi")
    String BaseUrl_olmorderbffapi();

    @Key("${env}.${cloud}.BaseUrl_olmordermgntapi")
    String BaseUrl_olmordermgntapi();



    @Key("${env}.${cloud}.planDbUrl")
    String planDbUrl();

    @Key("${env}.${cloud}.planDBName")
    String planDBName();

    @Key("${env}.${cloud}.entitleDbUrl")
    String entitleDbUrl();

    @Key("${env}.${cloud}.entitleDBName")
    String entitleDBName();

    @Key("${env}.${cloud}.url")
    String url();

    @Key("${env}.${cloud}.BaseUrl_uapi")
    String BaseUrl_uapi();

    @Key("${env}.${cloud}.BaseUrl_User_Consents")
    String BaseUrl_User_Consents();

    @Key("${env}.${cloud}.payCmsDb")
    String payCmsDb();

    @Key("${env}.${cloud}.payCmsdbName")
    String payCmsdbName();

    @Key("${env}.${cloud}.BaseUrl_getCountry")
    String BaseUrl_getCountry();

    @Key("${env}.${cloud}.SpapiInvalidToken")
    String SpapiInvalidToken();

    @Key("${env}.${cloud}.SpapiExpiredToken")
    String SpapiExpiredToken();

    @Key("${env}.${cloud}.BaseUrl_spAPI")
    String BaseUrl_spAPI();

    @Key("${env}.${cloud}.BaseUrl_subscriptionAPIv2")
    String BaseUrl_subscriptionAPIv2();

    @Key("${env}.${cloud}.BaseUrl_b2bAPI")
    String BaseUrl_b2bAPI();

    @Key("${env}.${cloud}.BaseUrl_b2bPartnerV3API")
    String BaseUrl_b2bPartnerV3API();
//AdTech
    @Key("${env}.${cloud}.BaseUrl_DisplayAdsV1")
    String BaseUrl_DisplayAdsV1();

    @Key("${env}.${cloud}.BaseUrl_VideoAdsAPI")
    String BaseUrl_VideoAdsAPI();

    @Key("${env}.${cloud}.BaseUrl_AudioAdsAPI")
    String BaseUrl_AudioAdsAPI();

    @Key("${env}.${cloud}.BaseUrl_AdTechConfigAuthenticationAPI")
    String BaseUrl_AdTechConfigAuthenticationAPI();

    @Key("${env}.${cloud}.AdTechUserName")
    String AdTechUserName();

    @Key("${env}.${cloud}.AdTechPassword")
    String AdTechPassword();

//AdTech End

    @Key("${env}.${cloud}.BaseUrl_gwAPI")
    String BaseUrl_gwAPI();

    @Key("${env}.${cloud}.BaseUrl_collectionAPI")
    String BaseUrl_collectionAPI();

    @Key("${env}.${cloud}.BaseUrl_whAPI")
    String BaseUrl_whAPI();

    @Key("${env}.${cloud}.BaseUrl_whAPI_pnode")
    String BaseUrl_whAPI_pnode();

    @Key("${env}.${cloud}.BaseUrl_profileAPI")
    String BaseUrl_profileAPI();

    @Key("${env}.${cloud}.BaseUrl_userActionAPI")
    String BaseUrl_userActionAPI();

    @Key("${env}.${cloud}.BaseUrl_ContentAPI")
    String BaseUrl_ContentAPI();

    @Key("${env}.${cloud}.BaseUrl_SearchAPI")
    String BaseUrl_SearchAPI();

    @Key("${env}.${cloud}.BaseUrl_Virginksa_API")
    String BaseUrl_Virginksa_API();


    @Key("${env}.${cloud}.BaseUrl_userchoiceAPI")
    String BaseUrl_userchoiceAPI();

    @Key("${env}.${cloud}.BaseUrl_entitlementAPI")
    String BaseUrl_entitlementAPI();

    @Key("${env}.${cloud}.BaseUrl_Telkomsel_Stage")
    String BaseUrl_Telkomsel_Stage();

    @Key("${env}.${cloud}.BaseUrl_LaunchAPI")
    String BaseUrl_LaunchAPI();
    @Key("${env}.${cloud}.BaseUrl_gambitAPI")
    String BaseUrl_gambitAPI();

    @Key("${env}.${cloud}.deviceId")
    String deviceId();

    @Key("${env}.${cloud}.esk")
    String esk();

    @Key("${env}.${cloud}.deviceId2")
    String deviceId2();

    @Key("${env}.${cloud}.esk2")
    String esk2();

    @Key("${env}.${cloud}.deviceId3")
    String deviceId3();

    @Key("${env}.${cloud}.esk3")
    String esk3();

    @Key("${env}.${cloud}.deviceId4")
    String deviceId4();

    @Key("${env}.${cloud}.esk4")
    String esk4();

    @Key("${env}.${cloud}.deviceId5")
    String deviceId5();

    @Key("${env}.${cloud}.esk5")
    String esk5();

    @Key("${env}.${cloud}.deviceId6")
    String deviceId6();

    @Key("${env}.${cloud}.esk6")
    String esk6();

    @Key("${env}.${cloud}.rateLimiterEnabled")
    boolean rateLimiterEnabled();

    @Key("${env}.${cloud}.privilegeSecret")
    String privilegeSecret();

    @Key("${env}.${cloud}.nimbusDbUrl")
    String nimbusDbUrl();

    @Key("${env}.${cloud}.nimbusDbName")
    String nimbusDbName();

    @Key("${env}.${cloud}.username")
    String username();

    @Key("${env}.${cloud}.password")
    String password();

    @Key("${env}.${cloud}.authTokenExpiry")
    String authTokenExpiry();

    @Key("${env}.${cloud}.authTokenExpiryRefOrin2")
    String authTokenExpiryRefOrin2();

    @Key("${env}.${cloud}.authTokenExpiryRenew")
    String authTokenExpiryRenew();

    @Key("${env}.${cloud}.dbPrefix")
    String dbPrefix();

    @Key("${env}.${cloud}.BaseUrl_securepayments")
    String BaseUrl_securepayments();

    @Key("${env}.${cloud}.BaseUrl_SubscriptionAPIv3")
    String BaseUrl_SubscriptionAPIv3();

    @Key("${env}.${cloud}.xauthtokenkey")
    String xauthtokenkey();

    @Key("${env}.${cloud}.xauthtokenvalue")
    String xauthtokenvalue();

    @Key("${env}.${cloud}.xauthclienttokenvalue")
    String xauthclienttokenvalue();

    @Key("${env}.${cloud}.xauthclienttokenvalue1")
    String xauthclienttokenvalue1();

    @Key("${env}.${cloud}.xauthclienttokenkey")
    String xauthclienttokenkey();

    @Key("${env}.${cloud}.xauthkey")
    String xauthkey();

    @Key("${env}.${cloud}.xauthvalue")
    String xauthvalue();

    @Key("${env}.${cloud}.BaseUrl_SubscriptionAPIv1")
    String BaseUrl_SubscriptionAPIv1();

    @Key("${env}.${cloud}.dbPrefixb2b")
    String dbPrefixb2b();

    @Key("${env}.${cloud}.apikey")
    String apiKey();

    @Key("${env}.${cloud}.BaseUrl_uapi_non_auth")
    String BaseUrl_uapi_non_auth();
    @Key("${env}.${cloud}.shortUrl")
    String shortUrl();

    @Key("${env}.${cloud}.BaseUrl_UDM")
    String BaseUrl_UDM();

    @Key("${env}.${cloud}.BaseUrl_User_Comments")
    String BaseUrl_User_Comments();

    @Key("${env}.${cloud}.BaseUrl_Nimbus")
    String BaseUrl_Nimbus();

    @Key("${env}.${cloud}.BaseUrl_uapi_auth")
    String BaseUrl_uapi_auth();

    @Key("${env}.${cloud}.BaseUrl_useraction_genxaccesstoken")
    String BaseUrl_useraction_genxaccesstoken();

    @Key("${env}.${cloud}.uapi_email")
    String uapi_email();

    @Key("${env}.${cloud}.BaseUrl_DeviceAPI")
    String BaseUrl_DeviceAPI();

    @Key("${env}.${cloud}.guestToken")
    String guestToken();

    @Key("${env}.${cloud}.pathParamCollectionHomePage")
    String pathParamCollectionHomePage();

    @Key("${env}.${cloud}.pathParamCollectionNews")
    String pathParamCollectionNews();

    @Key("${env}.${cloud}.pathParamCollectionMusic")
    String pathParamCollectionMusic();

    @Key("${env}.${cloud}.pathParamCollectionTVShows")
    String pathParamCollectionTVShows();

    @Key("${env}.${cloud}.pathParamCollectionMovies")
    String pathParamCollectionMovies();

    @Key("${env}.${cloud}.pathParamCollectionPremium")
    String pathParamCollectionPremium();

    @Key("${env}.${cloud}.pathParamCollectionPlay")
    String pathParamCollectionPlay();

    @Key("${env}.${cloud}.pathParamCollectionEduraa")
    String pathParamCollectionEduraa();

    @Key("${env}.${cloud}.pathParamCollectionWebSeries")
    String pathParamCollectionWebSeries();

    @Key("${env}.${cloud}.pathParamCollectionLiveTV")
    String pathParamCollectionLiveTV();

    @Key("${env}.${cloud}.pathParamCollectionKids")
    String pathParamCollectionKids();

    @Key("${env}.${cloud}.pathParamCollectionVideos")
    String pathParamCollectionVideos();

    @Key("${env}.${cloud}.pathParamCollectionChannels")
    String pathParamCollectionChannels();

    @Key("${env}.${cloud}.pathParamCollectionZeeplex")
    String pathParamCollectionZeeplex();

    @Key("${env}.${cloud}.pathParamGetGwapiChannelDetails")
    String pathParamGetGwapiChannelDetails();

    @Key("${env}.${cloud}.pathParamgetDetailswithLicense")
    String pathParamgetDetailswithLicense();

    @Key("${env}.${cloud}.pathParamgetTVDetails")
    String pathParamgetTVDetails();

    @Key("${env}.${cloud}.pathParamgetTVShowsLatest")
    String pathParamgetTVShowsLatest();

    @Key("${env}.${cloud}.pathParamgetTVShowsContent")
    String pathParamgetTVShowsContent();

    @Key("${env}.${cloud}.tagMenuFooter")
    String tagMenuFooter();

    @Key("${env}.${cloud}.pathParamgetSeasonContent")
    String pathParamgetSeasonContent();

    @Key("${env}.${cloud}.pathParamgetSeasonId")
    String pathParamgetSeasonId();

    @Key("${env}.${cloud}.pathParamgetChannelId")
    String pathParamgetChannelId();

    @Key("${env}.${cloud}.BaseUrl_CQC")
    String BaseUrl_CQC();

    @Key("${env}.${cloud}.BaseUrl_MusicAPI")
    String BaseUrl_MusicAPI();
    @Key("${env}.${cloud}.pathParamShowId")
    String pathParamShowId();

    @Key("${env}.${cloud}.pathParamv1SeasonId")
    String pathParamv1SeasonId();
    @Key("${env}.${cloud}.epgNowChannelId")
    String epgNowChannelId();
    @Key("${env}.${cloud}.epgNowChannelIdNoEpg")
    String epgNowChannelIdNoEpg();
    @Key("${env}.${cloud}.TvshowWebSeriesId")
    String TvshowWebSeriesId();

    /*
     *Below is used for CMS Authorization Token.
     */
    @Key("${env}.${cloud}.cmsToken")
    String cmsToken();

    /*
     * Subscription V2 Advance Renewal
     * */
    @Key("${env}.${cloud}.advanceBearer")
    String advanceBearer();

    @Key("${env}.${cloud}.advanceBearer2")
    String advanceBearer2();

    @Key("${env}.${cloud}.cancelBearer1")
    String cancelBearer1();

    @Key("${env}.${cloud}.cancelBearer2")
    String cancelBearer2();

    @Key("${env}.${cloud}.customCacheCms")
    String customCacheCms();

    @Key("${env}.${cloud}.dbPrefixSubscription")
    String dbPrefixSubscription();

    @Key("${env}.${cloud}.BaseUrl_GAPI_Global_Consumer")
    String BaseUrl_GAPI_Global_Consumer();



    @Key("${env}.${cloud}.BaseUrl_GAPI_Global_Notification")
    String BaseUrl_GAPI_Global_Notification();

    @Key("${env}.${cloud}.device_identifier")
    String device_identifier();


    /**
     * Below are used for Polling
     * Please do not add anything in between not related to Polling
     */
    @Key("${env}.${cloud}.BaseUrl_consumer_polling")
    String BaseUrl_consumer_polling();

    @Key("${env}.${cloud}.BaseUrl_admin_polling")
    String BaseUrl_admin_polling();

    @Key("${env}.${cloud}.pollingApiKey")
    String pollingApiKey();

    @Key("${env}.${cloud}.pollingUserName")
    String pollingUserName();

    /**
     * Below are used for Zeepay
     * Please do not add anything in between not related to Zeepay
     */
    @Key("${env}.${cloud}.BaseUrl_Turbine")
    String BaseUrl_Turbine();

    @Key("${env}.${cloud}.TurbineApiKey")
    String TurbineApiKey();

    @Key("${env}.${cloud}.PaymentApiKey")
    String PaymentApiKey();

    @Key("${env}.${cloud}.PropayApiKey")
    String PropayApiKey();

    @Key("${env}.${cloud}.BaseUrl_Propay")
    String BaseUrl_Propay();

    @Key("${env}.${cloud}.BaseUrl_Transformer")
    String BaseUrl_Transformer();

    @Key("${env}.${cloud}.BaseUrl_Themis")
    String BaseUrl_Themis();

    @Key("${env}.${cloud}.ThemisApiKey")
    String ThemisApiKey();

    @Key("${env}.${cloud}.thmemisDbUrl")
    String thmemisDbUrl();

    @Key("${env}.${cloud}.themisDbName")
    String themisDbName();

    @Key("${env}.${cloud}.BaseUrl_Payment")
    String BaseUrl_Payment();

    @Key("${env}.${cloud}.Auth_token")
    String Auth_token();

    @Key("${env}.${cloud}.cms_Key")
    String cms_Key();

    @Key("${env}.${cloud}.Payment_Postgres_url")
    String Payment_Postgres_url();

    @Key("${env}.${cloud}.Payment_Postgres_userName")
    String Payment_Postgres_userName();

    @Key("${env}.${cloud}.Payment_Postgres_passWord")
    String Payment_Postgres_passWord();

    @Key("${env}.${cloud}.OrderMgmtApiKey")
    String OrderMgmtApiKey();

    @Key("${env}.${cloud}.BaseUrl_Oms")
    String BaseUrl_Oms();
    @Key("${env}.${cloud}.BaseUrl_rokuprepareuat")
    String BaseUrl_rokuprepareuat();

    /**
     * Zeepay END
     */

    @Key("${env}.${cloud}.BaseUrl_GAPI_Global")
    String BaseUrl_GAPI_Global();

    @Key("${env}.${cloud}.BaseUrl_Telkomsel")
    String BaseUrl_Telkomsel();

    @Key("${env}.${cloud}.BaseUrl_Cobo")
    String BaseUrl_Cobo();

    @Key("${env}.${cloud}.BaseUrl_PartnerInt")
    String BaseUrl_PartnerInt();

    @Key("${env}.${cloud}.api_key")
    String api_key();

    @Key("${env}.${cloud}.BaseUrl_SMSSubscriptionApi")
    String BaseUrl_SMSSubscriptionApi();


    @Key("${env}.${cloud}.BaseUrl_Checkout")
    String BaseUrl_Checkout();

    @Key("${env}.${cloud}.PACK_ENTITLEMENT_ISC_KEY")
    String PACK_ENTITLEMENT_ISC_KEY();

    @Key("${env}.${cloud}.PLAN_API_KEY")
    String PLAN_API_KEY();

    @Key("${env}.${cloud}.OLM_ORDER_ISC_KEY")
    String OLM_ORDER_ISC_KEY();

    @Key("${env}.${cloud}.UserAPI_SQLServer_url")
    String UserAPI_SQLServer_url();

    @Key("${env}.${cloud}.UserAPI_SQLServer_userName")
    String UserAPI_SQLServer_userName();

    @Key("${env}.${cloud}.UserAPI_SQLServer_passWord")
    String UserAPI_SQLServer_passWord();

    @Key("${env}.${cloud}.Subscription_SQLServer_url")
    String Subscription_SQLServer_url();

    @Key("${env}.${cloud}.Subscription_SQLServer_userName")
    String Subscription_SQLServer_userName();

    @Key("${env}.${cloud}.Subscription_SQLServer_passWord")
    String Subscription_SQLServer_passWord();

    @Key("${env}.${cloud}.OrderDB_Postgres_url")
    String OrderDB_Postgres_url();

    @Key("${env}.${cloud}.OrderDB_Postgres_userName")
    String OrderDB_Postgres_userName();

    @Key("${env}.${cloud}.OrderDB_Postgres_passWord")
    String OrderDB_Postgres_passWord();

    @Key("${env}.${cloud}.Subscription_Postgres_url")
    String Subscription_Postgres_url();

    @Key("${env}.${cloud}.Subscription_Postgres_userName")
    String Subscription_Postgres_userName();

    @Key("${env}.${cloud}.Subscription_Postgres_passWord")
    String Subscription_Postgres_passWord();

    @Key("${env}.${cloud}.B2BAPI_MySQL_url")
    String B2BAPI_MySQL_url();

    @Key("${env}.${cloud}.B2BAPI_MySQL_userName")
    String B2BAPI_MySQL_userName();

    @Key("${env}.${cloud}.B2BAPI_MySQL_passWord")
    String B2BAPI_MySQL_passWord();


    @Key("${env}.${cloud}.rateLimiterCount")
    int rateLimiterCount();

    @Key("${env}.${cloud}.cms_Authorization")
    String cms_Authorization();

    @Key("${env}.${cloud}.BaseUrl_VerifyToken")
    String BaseUrl_VerifyToken();

    @Key("${env}.${cloud}.UserChoice_MySQL_url")
    String UserChoice_MySQL_url();

    @Key("${env}.${cloud}.UserChoice_MySQL_userName")
    String UserChoice_MySQL_userName();

    @Key("${env}.${cloud}.UserChoice_MySQL_passWord")
    String UserChoice_MySQL_passWord();

    @Key("${env}.${cloud}.dbPrefixUserChoice")
    String dbPrefixUserChoice();

    @Key("${env}.${cloud}.SRB_ISC_KEY")
    String SRB_ISC_KEY();

    @Key("${env}.${cloud}.BaseUrl_SubscriptionRuleBook")
    String BaseUrl_SubscriptionRuleBook();

    @Key("${env}.${cloud}.BaseUrl_SubscriptionViaIngestion")
    String BaseUrl_SubscriptionViaIngestion();

    @Key("${env}.${cloud}.CONTACT_POINT")
    String CONTACT_POINT();

    @Key("${env}.${cloud}.KEYSPACE_NAME")
    String KEYSPACE_NAME();

    @Key("${env}.${cloud}.PORT")
    String PORT();


    @Key("${env}.${cloud}.BaseUrl_UserReferral")
    String BaseUrl_UserReferral();

    @Key("${env}.${cloud}.BaseUrl_CpAPI")
    String BaseUrl_CpAPI();

    @Key("${env}.${cloud}.BaseUrl_Watch_History_Vertx")
    String BaseUrl_Watch_History_Vertx();

    @Key("${env}.${cloud}.BaseUrl_AMA_Admin")
    String BaseUrl_AMA_Admin();

    @Key("${env}.${cloud}.BaseUrl_AMA_Service")
    String BaseUrl_AMA_Service();

    @Key("${env}.${cloud}.BaseUrl_gamesApi")
    String BaseUrl_gamesApi();

    @Key("${env}.${cloud}.dbPrefixUserCoupon")
    String dbPrefixUserCoupon();

    @Key("${env}.${cloud}.Self_Server")
    String Self_Server();


    @Key("${env}.${cloud}.BaseUrl_B2BSelfServicePortal_PartnerIam")
    String BaseUrl_B2BSelfServicePortal_PartnerIam();

    @Key("${env}.${cloud}.BaseUrl_b2bClient")
    String BaseUrl_b2bClient();

    @Key("${env}.${cloud}.BaseUrl_b2bV4")
    String BaseUrl_b2bV4();

    @Key("${env}.${cloud}.UDMScyllaDbURL")
    String UDMScyllaDbURL();

    @Key("${env}.${cloud}.UDMScyllaDbPort")
    String UDMScyllaDbPort();

    @Key("${env}.${cloud}.UDMScyllaKeySpace")
    String UDMScyllaKeySpace();

    @Key("${env}.${cloud}.Juspay_success_email")
    String Juspay_success_email();

    @Key("${env}.${cloud}.Juspay_Failure_email")
    String Juspay_Failure_email();

    @Key("${env}.${cloud}.UMS_Scylla_Password")
    String UMS_Scylla_Password();

    @Key("${env}.${cloud}.UMS_Scylla_username")
    String UMS_Scylla_username();

    @Key("${env}.${cloud}.UMS_ScyllaKeySpace")
    String UMS_ScyllaKeySpace();

    @Key("${env}.${cloud}.UMS_ScyllaDbUR")
    String UMS_ScyllaDbUR();

    @Key("${env}.${cloud}.UMS_ScyllaDbPort")
    String UMS_ScyllaDbPort();

    @Key("${env}.${cloud}.UDMTokenKeySpace")
    String UDMTokenKeySpace();

    @Key("${env}.${cloud}.UDMUserName")
    String UDMUserName();

    @Key("${env}.${cloud}.UDMPassword")
    String UDMPassword();

    /**
     * Below are used for UserFeatureList
     * Please do not add anything in between not related to UserFeatureList
     */
    @Key("${env}.${cloud}.BaseUrl_FeatureListApi")
    String BaseUrl_FeatureListApi();

    @Key("${env}.${cloud}.BaseUrlSpanner")
    String BaseUrlSpanner();

    @Key("${env}.${cloud}.SpannerProjectInstance")
    String SpannerProjectInstance();

    @Key("${env}.${cloud}.User_Mgmt_Scylla_username")
    String User_Mgmt_Scylla_username();

    @Key("${env}.${cloud}.User_Mgmt_Scylla_Password")
    String User_Mgmt_Scylla_Password();

    @Key("${env}.${cloud}.SECRET_KEYDB")
    String SECRET_KEYDB();

    @Key("${env}.${cloud}.InitVector")
    String InitVector();

    @Key("${env}.${cloud}.BaseUrl_uapi_tokenGenration")
    String BaseUrl_uapi_tokenGenration();

    @Key("${env}.${cloud}.datacenter")
    String datacenter();

    @Key("${env}.${cloud}.UDMUserName1")
    String UDMUserName1();

    @Key("${env}.${cloud}.UDMPassword1")
    String UDMPassword1();

    @Key("${env}.${cloud}.datacenter2")
    String datacenter2();

    @Key("${env}.${cloud}.UapiTokenClientId")
    String UapiTokenClientId();

    @Key("${env}.${cloud}.UapiTokenClientSecretKey")
    String UapiTokenClientSecretKey();

    @Key("${env}.${cloud}.UMS_ScyllaDbWatchlist")
    String UMS_ScyllaDbWatchlist();

    @Key("${env}.${cloud}.UMS_ScyllaWatchlist_username")
    String UMS_ScyllaWatchlist_username();

    @Key("${env}.${cloud}.UMS_ScyllaWatchlist_Password")
    String UMS_ScyllaWatchlist_Password();

    @Key("${env}.${cloud}.UMS_ScyllaKeySpace3")
    String UMS_ScyllaKeySpace3();
    @Key("${env}.${cloud}.UapiInvalidClientId")
    String UapiInvalidClientId();
    @Key("${env}.${cloud}.UapiInvalidClientSecret")
    String UapiInvalidClientSecretKey();

    @Key("${env}.${cloud}.ResponseMessage")
    String ResponseMessage();

    @Key("${env}.${cloud}.SecurePaymentInvalidToken")
    String SecurePaymentInvalidToken();

    @Key("${env}.${cloud}.WatchlistMeta")
    String WatchlistMeta();
    @Key("${env}.${cloud}.ShowId")
    String ShowId();
    @Key("${env}.${cloud}.OriginalsId")
    String OriginalsId();
    @Key("${env}.${cloud}.reflink")
    String reflink();
    @Key("${env}.${cloud}.refProgramId")
    String refProgramId();
    @Key("${env}.${cloud}.first_name")
    String first_name();
    @Key("${env}.${cloud}.last_name")
    String last_name();
    @Key("${env}.${cloud}.Referral_Postgres_url")
    String Referral_Postgres_url();
    @Key("${env}.${cloud}.Referral_Postgres_Username")
    String Referral_Postgres_Username();
    @Key("${env}.${cloud}.Referral_Postgres_Password")
    String Referral_Postgres_Password();
    @Key("${env}.${cloud}.ShareLink_Initial")
    String ShareLink_Initial();
    @Key("${env}.${cloud}.name")
    String name();
    @Key("${env}.${cloud}.usedTxtId")
    String usedTxtId();
    @Key("${env}.${cloud}.name1")
    String name1();
    @Key("${env}.${cloud}.planId")
    String planId();
    @Key("${env}.${cloud}.BaseUrl_Customer")
    String BaseUrl_Customer();
    @Key("${env}.${cloud}.Admin_identifier")
    String Admin_identifier();
    @Key("${env}.${cloud}.Admin_method")
    String Admin_method();
    @Key("${env}.${cloud}.Admin_password")
    String Admin_password();

    @Key("${env}.Pcd_Baseurl")
    String Pcd_Baseurl();
    @Key("${env}.PcdToken_Baseurl")
    String PcdToken_Baseurl();
    @Key("${env}.IspToken_Baseurl")
    String IspToken_Baseurl();
    @Key("${env}.pcdPassword")
    String pcdPassword();
    @Key("${env}.pcdUsername")
    String pcdUsername();
    @Key("${env}.pcdClientSecret")
    String pcdClientSecret();
    @Key("${env}.${cloud}.UserActivity_Url")
    String UserActivity_Url();
    @Key("${env}.${cloud}.BaseUrl_CS_SelfHelp")
    String BaseUrl_CS_SelfHelp();
    @Key("${env}.${cloud}.BaseURL_CS_CRMCustomer")
    String BaseURL_CS_CRMCustomer();
    @Key("${env}.${cloud}.Mirage_ApiKey")
    String Mirage_ApiKey();
    @Key("${env}.${cloud}.BaseUrl_b2bMirage")
    String BaseUrl_b2bMirage();
    @Key("${env}.${cloud}.BaseUrl_getCode_getDeviceUser")
    String BaseUrl_getCode_getDeviceUser();
    @Key("${env}.${cloud}.Partner_TicketID")
    String Partner_TicketID();
    @Key("${env}.${cloud}.BaseUrl_UserAppCRM")
    String BaseUrl_UserAppCRM();
    @Key("${env}.${cloud}.BaseUrl_Raven")
    String BaseUrl_Raven();
    @Key("${env}.${cloud}.Raven_Authorization_Token")
    String Raven_Authorization_Token();
    @Key("${env}.${cloud}.Raven_Cookie")
    String Raven_Cookie();
    @Key("${env}.${cloud}.Juspropay_Authorization_Token")
    String Juspropay_Authorization_Token();
    @Key("${env}.${cloud}.Juspropay_Baseurl")
    String Juspropay_Baseurl();
    @Key("${env}.${cloud}.BaseUrl_AmazonIap")
    String BaseUrl_AmazonIap();
    @Key("${env}.${cloud}.X_Access_Token")
    String X_Access_Token();
    @Key("${env}.${cloud}.BaseUrl_Invoice_v1_purchase")
    String BaseUrl_Invoice_v1_purchase();
    @Key("${env}.${cloud}.xAuthClientTokenValueForContinueWatching")
    String clientTokenForContinueWatching();
    @Key("${env}.${cloud}.xAuthClientTokenValueForContent")
    String clientTokenForContent();
    @Key("${env}.${cloud}.xAuthClientTokenValueForAVOD")
    String clientTokenForAVOD();
    @Key("${env}.${cloud}.xAuthClientTokenForS2S")
    String clientTokenForS2S();
    @Key("${env}.${cloud}.Movie_Asset")
    String Movie_Asset();
    @Key("${env}.${cloud}.TvEpisode_Asset")
    String TvEpisode_Asset();
    @Key("${env}.${cloud}.NextTvEpisode_Asset")
    String NextTvEpisode_Asset();
    @Key("${env}.${cloud}.WebSeriesEpisode_Asset")
    String WebSeriesEpisode_Asset();
    @Key("${env}.${cloud}.WatchHistoryUser")
    String WatchHistoryUser();
    @Key("${env}.${cloud}.TvShowID")
    String TvShowID();
    @Key("${env}.${cloud}.Client_Ticket")
    String Client_Ticket();
  
    @Key("${env}.${cloud}.BaseUrl_Metadata")
    String BaseUrl_Metadata();

    @Key("${env}.${cloud}.BaseUrl_ParallelDashboard")
    String BaseUrl_ParallelDashboard();

    @Key("${env}.${cloud}.ParallelDashboardUser")
    String ParallelDashboardUser();

    @Key("${env}.${cloud}.v2Profiles")
    boolean v2Profiles();
  
   @Key("${env}.${cloud}.User_UserName")
    String User_UserName();

    @Key("${env}.${cloud}.User_Password")
    String User_Password();

    @Key("${env}.${cloud}.DownLoadApiAndroidContent")
    String DownLoadApiAndroidContent();

    @Key("${env}.${cloud}.DownLoadApiIosContent")
    String DownLoadApiIosContent();
    @Key("${env}.${cloud}.gambitAssetId")
    String gambitAssetId();
    @Key("${env}.${cloud}.gambitUser1")
    String gambitUser1();
    @Key("${env}.${cloud}.gambitAssetIdNoPoll")
    String gambitAssetIdNoPoll();

    @Key("${env}.${cloud}.BaseUrl_LikeDislike")
    String BaseUrl_LikeDislike();
    @Key("${env}.${cloud}.gambitUser2")
    String gambitUser2();
    @Key("${env}.${cloud}.gambitUser3")
    String gambitUser3();
    @Key("${env}.${cloud}.gambitUser4")
    String gambitUser4();
    @Key("${env}.${cloud}.gambitGlobalUser1")
    String gambitGlobalUser1();
    @Key("${env}.${cloud}.gambitGlobalUser2")
    String gambitGlobalUser2();
    @Key("${env}.${cloud}.gambitGlobalUser3")
    String gambitGlobalUser3();
    @Key("${env}.${cloud}.BaseUrl_iltLeaderboard")
    String BaseUrl_iltLeaderboard();
    @Key("${env}.${cloud}.hostILTLeaderBoard")
    String hostILTLeaderBoard();
    @Key("${env}.${cloud}.nonGambitUser")
    String nonGambitUser();
    @Key("${env}.${cloud}.campaignId")
    String campaignId();
    @Key("${env}.${cloud}.campaignId1")
    String campaignId1();


    @Key("${env}.${cloud}.RECO_ScyllaDbURL")
    String RECO_ScyllaDbURL();
    @Key("${env}.${cloud}.RECO_ScyllaDbPort")
    String RECO_ScyllaDbPort();
    @Key("${env}.${cloud}.RECO_Scylla_username")
    String RECO_Scylla_username();
    @Key("${env}.${cloud}.RECO_Scylla_Password")
    String RECO_Scylla_Password();
    @Key("${env}.${cloud}.RECO_ScyllaKeySpace")
    String RECO_ScyllaKeySpace();


    @Key("${env}.${cloud}.Kafka_Server")
    String Kafka_Server();
    @Key("${env}.${cloud}.Kafka_Username")
    String Kafka_Username();
    @Key("${env}.${cloud}.Kafka_Password")
    String Kafka_Password();
    @Key("${env}.${cloud}.BaseUrl_avalaraApi")
    String BaseUrl_avalaraApi();

    @Key("${env}.${cloud}.BaseUrl_xtraApi")
    String BaseUrl_xtraApi();

    @Key("${env}.${cloud}.avalaraToken")
    String avalaraToken();

    @Key("${env}.${cloud}.tokenForGuest")
    String tokenForGuest();


}