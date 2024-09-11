package org.enums;

public enum LogLevel {

    ERROR("error"),
    DEBUG("debug"),
    INFO("info");

    private String value;


    LogLevel(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
