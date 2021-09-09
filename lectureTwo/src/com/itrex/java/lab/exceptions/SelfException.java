package com.itrex.java.lab.exceptions;

public class SelfException extends RuntimeException {

    private final String customField;

    SelfException(String customField, String msg) {
        super(msg);
        this.customField = customField;
    }

    public String getCustomField() {
        return customField;
    }

}
