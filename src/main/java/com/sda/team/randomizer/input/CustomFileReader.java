package com.sda.team.randomizer.input;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CustomFileReader {
    public static List<String> loadData(String path) {
        File file = new File(path);
        List<String> peopleNames = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                peopleNames.add(currentLine);
            }
        } catch (IOException e) {
            System.out.println("could not load data from " + path);
        }
        return peopleNames;
    }

    public static List<String> loadDataUsingNio(String filePath) {
        Path path = Paths.get(filePath.substring(6));
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("failed loading data from " + filePath);
        }
        return result;
    }

}
