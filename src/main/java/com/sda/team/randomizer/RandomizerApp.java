package com.sda.team.randomizer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RandomizerApp {

    public static void main(String[] args) {
        System.out.println("running");

        // read a person's name from the user input
//        Scanner scanner = new Scanner(System.in);
//        String name = scanner.nextLine();

        // TODO: implement random difficulty setting
        // create object from name
//        Person person = new Person(name, 1);
        Person person = new Person("name", 1);

        // TODO: use relative path
        String relativePath = RandomizerApp.class.getResource("/people.txt").toString();

        String path = "C:\\dev\\sda\\group11-team\\src\\main\\resources\\people.txt";

        addPersonByAppend(path, person);

        // save person to list (database)
        List<Person> people = new ArrayList<>();
        people.add(person);

        List<String> listOfStrings = loadData(path);
        printList(listOfStrings);
    }

    private static List<String> loadData(String path) {
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
        Path path = Paths.get(filePath);
        List<String> result = new ArrayList<>();
        try {
            result = Files.readAllLines(path);
        } catch (IOException e) {
            System.out.println("failed loading data from " + filePath);
        }
        return result;
    }

    private static void printList(List<String> list) {
        list.forEach(element -> System.out.println(element));
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
            bufferedWriter.write(person.getName() + "\n");
        } catch (IOException e) {
            System.out.println("error writing file " + path);
        }
    }

    // TODO: add person by append using nio
}
