package com.sda.team.consent;

import com.sda.team.consent.exceptions.UnknownConsentTypeException;

import java.util.Arrays;

public enum ConsentType {

    ACCEPTED("consent accepted"),
    REJECTED("consent rejected"),
    PENDING("consent pending");


    private final String code;

    ConsentType(String code) {
        this.code = code;
    }

    public static ConsentType findConsentTypeByCode(String code) throws UnknownConsentTypeException {
        return Arrays.stream(values())
                .filter(consentType -> consentType.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new UnknownConsentTypeException());
    }

    public String getCode() {

        return code;
    }


}
