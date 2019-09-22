package com.sda.team.randomizer.output;

import com.sda.team.randomizer.model.Person;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CustomFileWriter {

    // TODO: make non static
    /**
     * Create a file writer using a path
     * Create a buffered writer using a file writer (for performance)
     *
     * @param path   destination file path
     * @param person the person to be written
     */
    public static void addPersonByAppend(String path, Person person) {
        try (FileWriter fileWriter = new FileWriter(path, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(person.getName() + "\n");
        } catch (IOException e) {
            System.out.println("error writing file " + path);
        }
    }

    // TODO: add person by append using nio
    public static void addPersonByAppendUsingNio(String pathAsString, Person person) {
        Path path = Paths.get(pathAsString.substring(6));
        try {
            Files.write(path, person.getName().getBytes());
        } catch (IOException e) {
            System.out.println("error adding person to file");
        }
    }
}
