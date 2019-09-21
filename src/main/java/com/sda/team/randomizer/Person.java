package com.sda.team.randomizer;

public class Person {

    private String name;
    private int difficulty;
    private boolean isPresent;

    public Person(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.isPresent = true;
    }

    public String getName() {
        return this.name;
    }
}
