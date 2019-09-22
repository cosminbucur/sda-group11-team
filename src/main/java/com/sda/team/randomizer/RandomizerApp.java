package com.sda.team.randomizer;

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

        CustomFileWriter.addPersonByAppend(path, person);

        // save person to list (database)
        List<Person> people = new ArrayList<>();
        people.add(person);

        List<String> listOfStrings = CustomFileReader.loadDataUsingNio(path);
        ListUtil.printList(listOfStrings);
    }


    public static List<Person> sortPeopleByDifficulty(List<Person> people) {
        Collections.sort(people);
        System.out.println("People after sort");
        System.out.println(people.toString());
        return people;
    }
}
