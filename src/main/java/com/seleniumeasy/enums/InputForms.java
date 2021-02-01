package com.seleniumeasy.enums;

public enum InputForms {
    SIMPLE_FORM_DEMO("Simple Form Demo"),
    CHECKBOX_DEMO("Checkbox Demo"),
    SELECT_DROPDOWN_LIST("Select Dropdown List"),
    RADIO_BUTTONS_DEMO("Radio Buttons Demo"),
    INPUT_FORM_SUBMIT("Input Form Submit"),
    JQUERY_SELECT_DROPDOWN("JQuery Select Dropdown");

    private final String val;

    InputForms(String val) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
}