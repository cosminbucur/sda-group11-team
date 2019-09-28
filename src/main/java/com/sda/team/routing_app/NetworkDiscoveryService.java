package com.sda.team.routing_app;

import com.google.common.graph.Network;

import java.util.List;
import java.util.stream.Stream;

public class NetworkDiscoveryService {

    private Router router;
    private Stream<String> networkName;
    private List<Network> networks;


    public NetworkDiscoveryService(Router router, Stream<String> networkName) {
        this.router = router;
        this.networkName = networkName;
    }

    public void run() {

    }
}
