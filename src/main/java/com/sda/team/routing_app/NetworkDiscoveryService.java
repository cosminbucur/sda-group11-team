package com.sda.team.routing_app;

import com.sda.team.routing_app.model.Network;
import com.sda.team.routing_app.model.NetworkSignal;
import com.sda.team.routing_app.model.Router;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class NetworkDiscoveryService {

    private static final Logger logger = Logger.getLogger(NetworkDiscoveryService.class.getName());

    private Router router;
    private Stream<String> networkNames;
    private List<Network> networks = new ArrayList<>();

    public NetworkDiscoveryService(Router router, Stream<String> networkNames) {
        this.router = router;
        this.networkNames = networkNames;
    }

    public void run() {
        logger.info("Network discovery service running...");

        // for each network name, create a network
        // add each new network to the network list
        networkNames.forEach(networkName -> networks.add(createNetwork(networkName)));

        // for each network, attempt to connect
        networks.forEach(network -> router.connect(network));

        // print connected networks
        printConnectedNetworksMegaImproved();
    }

    private Network createNetwork(String networkName) {
        return new Network(networkName);
    }

    // TODO: print all connected networks
    private void printConnectedNetworks() {
        // iterate networks
        for (Network network : networks) {
            // check signal
            if (network.getSignal() != NetworkSignal.NO_CONNECTION) {
                // print
                System.out.println(network);
            }
        }
    }

    private void printConnectedNetworksImproved() {
        networks.stream()
                .filter(network -> network.getSignal() != NetworkSignal.NO_CONNECTION)
                .forEach(System.out::println);
    }

    private void printConnectedNetworksMegaImproved() {
        networks.stream()
                .filter(network -> network.isConnected())
                .forEach(System.out::println);
    }
}
