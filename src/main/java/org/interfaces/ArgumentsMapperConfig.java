package org.interfaces;

import org.aeonbits.owner.Config;

@Config.Sources(value ="file:${user.dir}/src/test/resources/testdata/Arguments.properties")
public interface ArgumentsMapperConfig extends Config {

    String platform();
    int version();
    String email();

    String id();

    String country();

    String language();
    String FORCE_UPDATE_QUERY();

}
