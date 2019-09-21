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

        String path = "C:\\dev\\sda-group11-team\\src\\main\\resources\\people.txt";

        try {
            loadData(path);
        } catch (IOException e) {
            System.out.println("error reading file");
        }
    }

    private static void loadData(String path) throws IOException {
        File file = new File(path);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String firstLine;
        List<String> person = new ArrayList<>();

        while ((firstLine = br.readLine()) != null) {
            person.add(firstLine);
        }
    }
}
