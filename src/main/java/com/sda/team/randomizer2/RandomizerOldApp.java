package com.sda.team.randomizer2;

import com.sda.team.randomizer.controller.MainController;
import com.sda.team.randomizer.model.Person;
import com.sda.team.randomizer.output.CustomFileWriter;
import com.sda.team.randomizer.ui.MenuBuilder;

import java.util.*;

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
    }

    private static String selectNextPerson() {
        Scanner scanner = new Scanner(System.in);
        String nextPersonName = scanner.nextLine();
        return nextPersonName;
    }

    private static Map<Integer, Person> convertListToMap(List<Person> personList) {
        Map<Integer, Person> personMap = new HashMap<>();

        for (Person person : personList) {
            personMap.put(person.getId(), person);
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
}
