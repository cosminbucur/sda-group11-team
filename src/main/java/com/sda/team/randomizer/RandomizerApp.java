package com.sda.team.randomizer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomizerApp {

    public static void main(String[] args) {
        System.out.println("running");

        // read a person's name from the user input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // save person to list (database)
        List<Person> people = new ArrayList<>();

        // create object from name
        Person person = new Person(name, 1);
        String path = "C:\\dev\\sda\\group11-team\\src\\main\\resources\\people.txt";

        addPersonByAppend(path, person);
    }

    public static List<Person> sortPeopleByDifficulty(List<Person> people) {
        Collections.sort(people);
        System.out.println("People after sort");
        System.out.println(people.toString());
        return people;
    }

    public static void displayMenu() {
        System.out.println("1. Add new person");
        System.out.println("2. Select next");
        System.out.println("3. Exit");
    }

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
            bufferedWriter.newLine();
            bufferedWriter.write(person.getName());
        } catch (IOException e) {
            System.out.println("error writing file " + path);
        }
    }

    // TODO: add person by append using nio
}
