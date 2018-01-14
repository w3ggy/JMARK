package com.jmark.utils.logger;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.List;

public class LogItem {
    private String tag;
    private String mesage;
    private List<Pair<String, String>> properties;

    public LogItem(String tag, String mesage, List<Pair<String, String>> properties) {
        this.tag = tag;
        this.mesage = mesage;
        this.properties = properties;
    }

    public String getTag() {
        return tag;
    }

    public String getMesage() {
        return mesage;
    }

    public List<Pair<String, String>> getProperties() {
        return properties;
    }
}
