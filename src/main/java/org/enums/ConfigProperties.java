package org.enums;

/**
 * Enums to restrict the values used on Property files. Without using enums there can be null pointer exceptions happening
 * because of typos.
 * <p>
 * Whenever a new value is added to property file, corressponding enum should be created here.
 */
public enum ConfigProperties {
	
	URL,
	OVERRIDEREPORTS,
	PASSEDSTEPSSCREENSHOTS,
	FAILEDSTEPSSCREENSHOTS,
	RETRYFAILEDTESTS,
	RUNMODE,
	SENDRESULTTOELK,
	SELENIUMGRIDURL,
	ELASTICURL,
	BROWSER
	
}
