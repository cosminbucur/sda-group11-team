package com.sda.team.randomizer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
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


        //add new people to file
        addNewPeopleToFile(person);


    }

    public static void addNewPeopleToFile(Person person) {
        try (FileWriter names = new FileWriter("names.txt", true);
             BufferedWriter writer = new BufferedWriter(names);
             PrintWriter out = new PrintWriter(writer)) {
            //STILL HAVE TO ADD ACTUAL NAMES TO THE FILE
            out.println(person.toString());

        } catch (IOException e) {
            System.out.println("no such thing");
        }
    }


}
