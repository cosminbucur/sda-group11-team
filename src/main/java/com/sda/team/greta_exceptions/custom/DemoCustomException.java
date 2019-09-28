package com.sda.team.greta_exceptions.custom;

public class DemoCustomException {

    public static void main(String[] args) throws Exception {

        Cat Randy = new Cat();
        Randy.setCatName("Randy");

        System.out.println("The cats' age is: " + Cat.catAge);

        System.out.println("Randy's weight: " + Randy.getWeight());

        try {
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
            Randy.weightGrows();
        } catch (CatAteTooMuchException e) {
            System.out.println(Randy.getCatName() + " ate too much!");
        }

        System.out.println("Randy's new weight: " + Randy.getWeight());

        Cat Carti = new Cat();
        Carti.setCatName("Carti");
        Carti.getWeight();
        System.out.println("Carti's weight is: " + Carti.getWeight());
    }
}
