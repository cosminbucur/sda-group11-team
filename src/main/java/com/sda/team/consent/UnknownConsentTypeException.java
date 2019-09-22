package com.sda.team.consent;

public class UnknownConsentTypeException extends Throwable {

    public Exception unknownConsentTypeException = new Exception();

    public Exception getUnknownConsentTypeException() {

        String unknownConsentTypeError = "Your text does not match our list of Consent Types";

        return unknownConsentTypeException;
    }

    public void setUnknownConsentTypeException(Exception unknownConsentTypeException) {
        this.unknownConsentTypeException = unknownConsentTypeException;
    }
}
