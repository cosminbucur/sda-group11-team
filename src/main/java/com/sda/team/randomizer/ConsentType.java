package com.sda.team.randomizer;

import com.sda.team.randomizer.exceptions.InvalidConsentType;

import java.util.Arrays;

public enum ConsentType {
    ACCEPTED("consent accepted"),
    REJECTED("consent rejected"),
    PENDING("consent pending");

    private String code;

    ConsentType(String code) {
        this.code = code;
    }

    public static ConsentType findConsentTypeByCode(String code) throws InvalidConsentType {
        return Arrays.stream(values())
                .filter(consentType -> consentType.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new InvalidConsentType());
    }

    public String getCode() {
        return code;
    }

}
