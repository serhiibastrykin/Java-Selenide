package com.seleniumeasy.enums;

public enum AlertsAndModals {
    FILE_DOWNLOAD("File Download"),
    JAVASCRIPT_ALERTS("Javascript Alerts");

    private final String val;

    AlertsAndModals(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}
