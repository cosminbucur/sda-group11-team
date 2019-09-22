package com.sda.team.consent;


public class DemoConsent {

    public static void main(String[] args) throws UnknownConsentTypeException {
        ConsentType.findConsentTypeByCode("accepted");
    }
}
