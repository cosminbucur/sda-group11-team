package com.sda.team.routing_app.input;

import java.util.stream.Stream;

public interface NetworkReader {

    Stream<String> loadNetworks();

}
