package com.sda.team.randomizer;

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

        // TODO: implement random difficulty setting
        // create object from name
        //   Person person = new Person(name, 1);

        // save person to list (database)
        List<Person> people = new ArrayList<>();
        //   people.add(person);
        people.add(new Person("vlad", 1));
        people.add(new Person("laur", 4));
        people.add(new Person("cosmina", 3));

        Collections.sort(people);

        System.out.println("People after sort");
        System.out.println(people.toString());






    }

}
