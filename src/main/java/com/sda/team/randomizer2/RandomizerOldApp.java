package com.sda.team.randomizer2;

import com.sda.team.randomizer.controller.MainController;
import com.sda.team.randomizer.model.Person;
import com.sda.team.randomizer.output.CustomFileWriter;
import com.sda.team.randomizer.ui.MenuBuilder;

import java.util.*;

public class RandomizerOldApp {
    private static final String PEOPLE_RELATIVE_PATH = RandomizerOldApp.class.getResource("/people.txt").toString();
    private static List<Person> people = new ArrayList<>();

    public static int getRandomDifficulty(int min, int max) {


        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;


    }

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
        Person nextPerson = selectNextPerson();

//        List<String> listOfStrings = CustomFileReader.loadDataUsingNio(PEOPLE_RELATIVE_PATH);
//        ListUtil.printList(listOfStrings);
    }

    public void hello() {

        System.out.println("hello");
    }

    private static Person selectNextPerson() {
        return null;
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
}
