package com.sda.team.randomizer2;

import com.sda.team.randomizer.controller.MainController;
import com.sda.team.randomizer.model.Person;
import com.sda.team.randomizer.output.CustomFileWriter;
import com.sda.team.randomizer.ui.MenuBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class RandomizerOldApp {
    private static final String PEOPLE_RELATIVE_PATH = RandomizerOldApp.class.getResource("/people.txt").toString();
    private static List<Person> people = new ArrayList<>();

    public static void main(String[] args) {
        MenuBuilder menuBuilder = new MenuBuilder();
        MainController mainController = new MainController();

        System.out.println("running");

        // display menu
//        menuBuilder.displayMenu();

        // grab user input
//        Scanner scanner = new Scanner(System.in);
//        String menuOption = scanner.nextLine();

        // dispatch option
//        mainController.dispatch(menuOption);

        // TODO: add person
//        addPerson();

        // I want to select next person randomly to complete a given task with a difficulty between 1 and 5.
        // TODO: select next person
        selectNextPerson();

//        List<String> listOfStrings = CustomFileReader.loadDataUsingNio(PEOPLE_RELATIVE_PATH);
//        ListUtil.printList(listOfStrings);

        List<Person> listToPrint = Arrays.asList(new Person("gigi", 1));
        Map<Integer, Person> mareMapa = convertListToMap(listToPrint);
        printMapElements(mareMapa);
    }

    public static void printMapElements(Map<Integer, Person> printingMap) {
        printingMap.forEach((integer, person) -> System.out.println(integer.toString() + " " + person.toString()));
    }

    private static String selectNextPerson() {
        Scanner scanner = new Scanner(System.in);
        String nextPersonName = scanner.nextLine();
        return nextPersonName;
    }

    private static Map<Integer, Person> convertListToMap(List<Person> personList) {
        Map<Integer, Person> personMap = new HashMap<>();

        for (Person person : personList) {
            // add to map ( index of person from list, person)
            personMap.put(personList.indexOf(person), person);
        }
        return personMap;
    }

    private static void addPerson() {
        // inform user
        System.out.println("who is the new person? \n");

        // read a person's name from the user input
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // create a person from name

        // TODO: implement random difficulty setting
        Person person = new Person(name, 0);

        // add to list
        people.add(person);

        // append to file
        CustomFileWriter.addPersonByAppendUsingNio(PEOPLE_RELATIVE_PATH, person);
    }

    public static List<Person> sortPeopleByDifficulty(List<Person> people) {
        Collections.sort(people);
        System.out.println("People after sort");
        System.out.println(people.toString());
        return people;
    }

    public static int getRandomDifficulty(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}
