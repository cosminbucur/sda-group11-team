package com.sda.team.routing_app;

import com.sda.team.routing_app.input.FileNetworkReader;
import com.sda.team.routing_app.input.NetworkReader;
import com.sda.team.routing_app.model.Router;

import java.util.stream.Stream;

// client
public class RoutingApp {

    public static void main(String[] args) {
        // TODO: load networks from file
        NetworkReader networkReader = new FileNetworkReader();
        Stream<String> networkNames = networkReader.loadNetworks();

        Router router = new Router();

        // TODO: start network discovery service
        NetworkDiscoveryService service = new NetworkDiscoveryService(router, networkNames);
        service.run();
    }
}
