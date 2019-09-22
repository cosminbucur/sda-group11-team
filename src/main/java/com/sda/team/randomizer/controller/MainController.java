package com.sda.team.randomizer.controller;

import com.sda.team.randomizer.repository.PersonRepository;

public class MainController {

    private PersonRepository personRepository = new PersonRepository();

    public void dispatch(String input) {
        switch (input) {
            case "1":
                personRepository.addPerson();
                break;
            case "2":
                personRepository.selectNextPerson();
                break;
            default:
                System.out.println("please select a valid option");
        }
    }
}
