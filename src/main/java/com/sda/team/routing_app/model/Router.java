package com.sda.team.routing_app.model;

public class Router implements Connectable {

    @Override
    public boolean connect(Network network) {
        // TODO: set connected based on signal value
        if (isNotConnectable(network)) {
            return false;
        } else {
            network.setConnected(true);
            return true;
        }
    }

    private boolean isNotConnectable(Network network) {
        return network.getSignal().equals(NetworkSignal.NO_CONNECTION);
    }
}
