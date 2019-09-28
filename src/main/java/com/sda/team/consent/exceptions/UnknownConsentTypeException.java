package com.sda.team.consent.exceptions;

public class UnknownConsentTypeException extends RuntimeException {

    public UnknownConsentTypeException() {
        super("Your text does not match our list of Consent Types");
    }
}


