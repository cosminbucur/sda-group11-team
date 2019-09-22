package com.sda.team.randomizer;

public enum ConsentType {

    ACCEPTED("consent accepted"),
    REJECTED("consent rejected"),
    PENDING("consent pending");

    private String message;

    ConsentType(String message) {
        this.message = message;
    }

    public static String typeOfConsent(String inputMessage) {
        if (inputMessage.equalsIgnoreCase("accepted")) {
            System.out.println(ACCEPTED.getMessage());
        }
        if (inputMessage.equalsIgnoreCase("rejected")) {
            System.out.println(REJECTED.getMessage());
        }
        if (inputMessage.equalsIgnoreCase("pending")) {
            System.out.println(PENDING.getMessage());
        }
        return inputMessage;
    }

    public String getMessage() {
        return message;
    }
}
