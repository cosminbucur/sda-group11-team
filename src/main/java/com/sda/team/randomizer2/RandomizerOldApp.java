package com.sda.team.randomizer2;

import com.sda.team.randomizer.controller.MainController;
import com.sda.team.randomizer.input.CustomFileReader;
import com.sda.team.randomizer.model.Person;
import com.sda.team.randomizer.output.CustomFileWriter;
import com.sda.team.randomizer.ui.MenuBuilder;
import com.sda.team.randomizer.utils.ListUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class RandomizerOldApp {

    public static void main(String[] args) {
        MenuBuilder menuBuilder = new MenuBuilder();
        MainController mainController = new MainController();

        System.out.println("running");

        // display menu
        menuBuilder.displayMenu();

        // grab user input
//        Scanner scanner = new Scanner(System.in);
//        String menuOption = scanner.nextLine();

        // dispatch option
//        mainController.dispatch(menuOption);

        // read a person's name from the user input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // TODO: add person
        addPerson(name);

        // TODO: implement random difficulty setting
        // create object from name
//        Person person = new Person(name, 1);
        Person person = new Person("name", 1);

        // TODO: use relative path
        String relativePath = RandomizerOldApp.class.getResource("/people.txt").toString();

        CustomFileWriter.addPersonByAppend(relativePath, person);

        // save person to list (database)
        List<Person> people = new ArrayList<>();
        people.add(person);

        List<String> listOfStrings = CustomFileReader.loadDataUsingNio(relativePath);
        ListUtil.printList(listOfStrings);
    }

    private static void addPerson(String name) {

    }


    public static List<Person> sortPeopleByDifficulty(List<Person> people) {
        Collections.sort(people);
        System.out.println("People after sort");
        System.out.println(people.toString());
        return people;
    }
}
