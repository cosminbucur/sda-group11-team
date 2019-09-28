package com.sda.team.routing_app.model;

import java.util.Random;

public class Network {

    private String name;
    private boolean connected;
    private NetworkSignal signal;

    public Network(String name) {
        this.name = name;
        this.signal = NetworkSignal.getSignalByRandomNumber(getRandomSignal(3, 0));
    }

    // TODO: implement random signal
    public int getRandomSignal(int max, int min) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }

    public String getName() {
        return name;
    }

    public boolean isConnected() {
        return connected;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public NetworkSignal getSignal() {
        return signal;
    }

    @Override
    public String toString() {
        return "Network{" +
                "name='" + name + '\'' +
                ", signal=" + signal +
                '}';
    }
}
