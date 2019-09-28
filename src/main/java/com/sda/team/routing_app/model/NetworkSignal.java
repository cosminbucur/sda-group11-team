package com.sda.team.routing_app.model;

public enum NetworkSignal {

    NO_CONNECTION,
    LOW,
    MEDIUM,
    HIGH;

    public static NetworkSignal getSignalByRandomNumber(int number) {
        // TODO: use switch
        switch (number) {
            case 0:
                return NO_CONNECTION;
            case 1:
                return LOW;
            case 2:
                return MEDIUM;
            case 3:
                return HIGH;
            // TODO: use custom exception
            default:
        }
        return LOW;
    }
}
