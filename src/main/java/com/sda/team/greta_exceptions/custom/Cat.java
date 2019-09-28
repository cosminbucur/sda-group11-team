package com.sda.team.greta_exceptions.custom;

public class Cat {

    public static double catAge = 1.5;
    private double weight;
    private String name;

    public Cat(String name) {
        this.weight = 2;
        this.name = name;
    }

    public void feed() throws CatAteTooMuchException {
        this.weight += 0.5;
        if (this.weight > 5.5) {
            throw new CatAteTooMuchException(this);
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
