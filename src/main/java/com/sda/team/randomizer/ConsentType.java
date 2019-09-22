package com.sda.team.randomizer;

import java.util.Scanner;

public enum ConsentType {

    ACCEPTED("consent accepted"),
    REJECTED("consent rejected"),
    PENDING("consent pending");

    String message;

    ConsentType(String message) {
        this.message = message;
    }

    public static String typeOfConsent() {
        Scanner input = new Scanner(System.in);
        String inputMessage = input.nextLine();
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
