package com.sda.team;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordCounter {

    Map<String, Integer> countWordOccurrence(Path path) throws IOException {
        List<String> lines = Files.readAllLines(path);
        Map<String, Integer> result = new HashMap<>();

        for (String line : lines) {
            int count = 0;

            if (result.containsKey(line)) {
                count++;
            }

            result.put(line, count + 1);
        }

        return result;
    }
}
