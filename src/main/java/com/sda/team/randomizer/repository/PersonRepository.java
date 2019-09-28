package com.sda.team.randomizer.repository;

import com.sda.team.randomizer.model.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonRepository {
    static List<Person> people = new ArrayList<>();

    public void addPerson(String name) {
        people.add(new Person(name, 0));
    }

    public void selectNextPerson() {
        System.out.println("in select next person");
    }
}
