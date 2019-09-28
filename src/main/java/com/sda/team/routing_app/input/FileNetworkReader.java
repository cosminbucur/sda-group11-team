package com.sda.team.routing_app.input;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FileNetworkReader implements NetworkReader {

    private static final Logger logger = Logger.getLogger(FileNetworkReader.class.getName());

    @Override
    public Stream<String> loadNetworks() {
        // FIXME: use property from application.yml
        List<String> networkNames = new ArrayList<>();

        try {
            Path applicationYmlPath = getApplicationYmlPath();
            Properties appProperties = new Properties();
            appProperties.load(new FileInputStream(applicationYmlPath.toString()));

            String networksPathString = appProperties.getProperty("networks_path");
            Path networksPath = Paths.get(networksPathString);

            networkNames = Files.readAllLines(networksPath);

        } catch (IOException e) {
            logger.severe("failed reading file " + e);
        }
        return networkNames.stream();
    }

    private Path getApplicationYmlPath() {
        Path path = null;
        try {
            path = Paths.get(this.getClass()
                    .getClassLoader()
                    .getResource("application.yml").toURI());
        } catch (Exception e) {
            logger.severe("failed to get application yml properties " + e);
        }
        return path;
    }
}
