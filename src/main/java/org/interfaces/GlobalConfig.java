package org.interfaces;

//import com.enums.UserType;
import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({"system:properties",
        "system:env",
        "file:${user.dir}/src/main/resources/globaldata/config.properties",
        "file:${user.dir}/src/main/resources/globaldata/globalconfig.properties"
})
public interface GlobalConfig extends Config {

    String userType();
    String NonsubscribedUserType();
    String SubscribedUserType();
    String GuestUserType();
    String NonsubscribedUserName();
    String NonsubscribedPassword();
    String SubscribedUserName();
    String SubscribedPassword();

    String TvShow();
    String Music();
    String News();
    String LiveTv();
    String PremiumMovieWithTrailer();
    String AudioTrackContent();
    String PremiumMovieNoTrailer2();
    String SearchContent();
    String Show();
    String Episode();
    String PremiumKannadaMovie();
    String PremiumMovieWithTrailer2();
    String PremiumShow();

    String MobileNumber();
    String Password();
    String FirstNameEdit();

   // @ConverterClass(UserType.class)
    //UserType guestUser();
    String browser();

    String FreeEpisode4();
    String TrailerOfPremiumMovie();
    String FreeMovie4();
    String ConsumptionsEpisode();
    String ConsumptionsFreeContent();
    String ConsumptionsPremiumContent();
    String ConsumptionsShow();
    String FreeMovie2();
}
