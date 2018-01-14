package com.jmark.utils.logger;

public enum  LogType {
    USER_AUTHORIZED("user_authorized"),
    APP_CHECK("app_check"),
    COMPONENT_CHECK("component_check");

    private final String tag;

    LogType(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
