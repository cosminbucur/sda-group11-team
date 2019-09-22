package com.sda.team.randomizer;

public class Person implements Comparable<Person> {

    private String name;
    private int difficulty;
    private boolean isPresent;

    public Person(String name, int difficulty) {
        this.name = name;
        this.difficulty = difficulty;
        this.isPresent = true;
    }

    @Override
    public int compareTo(Person person) {
        return this.difficulty - person.difficulty;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", difficulty=" + difficulty +
                        ", isPresent=" + isPresent +
                        '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public boolean isPresent() {
        return isPresent;
    }

    public void setPresent(boolean present) {
        isPresent = present;
    }
}
