package com.sda.team.greta_exceptions.custom;

public class Cat {

    public static String catAge = "1.5";
    private double weight = 2;
    private String catName;

    public void weightGrows() throws CatAteTooMuchException {
        this.weight += 0.5;
        if (this.weight > 5.5) {
            throw new CatAteTooMuchException(this);
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
}
