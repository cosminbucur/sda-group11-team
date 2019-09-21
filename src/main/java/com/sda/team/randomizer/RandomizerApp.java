package com.sda.team.randomizer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RandomizerApp {

    public static void main(String[] args) {
        System.out.println("running");

        // read a person's name from the user input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // TODO: implement random difficulty setting
        // create object from name
        Person person = new Person(name, 1);

        // save person to list (database)
        List<Person> people = new ArrayList<>();
        people.add(person);

        // TODO: use relative path
        String path = "C:\\dev\\sda\\group11-team\\src\\main\\resources\\people.txt";

        List<String> listOfStrings = loadData(path);
        printList(listOfStrings);
    }

    private static List<String> loadData(String path) {
        File file = new File(path);
        List<String> peopleNames = new ArrayList<>();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader br = new BufferedReader(fileReader)) {
            String firstLine;
            while ((firstLine = br.readLine()) != null) {
                peopleNames.add(firstLine);
            }
        } catch (IOException e) {
            System.out.println("could not load data from " + path);
        }
        return peopleNames;
    }

    // TODO: load data using nio

    private static void printList(List<String> list) {
        list.forEach(element -> System.out.println(element));
    }
}
