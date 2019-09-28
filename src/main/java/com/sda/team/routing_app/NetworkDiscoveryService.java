package com.sda.team.routing_app;

import java.util.List;
import java.util.stream.Stream;

public class NetworkDiscoveryService {

    public Stream<String> networkNames;
    public List<Network> networks;
    public Router router;

    public NetworkDiscoveryService(Stream<String> networkNames, Router router) {
        this.networkNames = networkNames;
        this.router = router;
    }

    public void run() {

    }
}
