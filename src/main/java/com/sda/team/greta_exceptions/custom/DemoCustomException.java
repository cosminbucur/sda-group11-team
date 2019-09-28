package com.sda.team.greta_exceptions.custom;

public class DemoCustomException {

    public static void main(String[] args) throws Exception {
        Cat randy = new Cat("Randy");
        System.out.println("The cats' age is: " + Cat.catAge);
        System.out.println("Randy's weight: " + randy.getWeight());

        try {
            randy.feed();
            randy.feed();
            randy.feed();
            randy.feed();
            randy.feed();
            randy.feed();
            randy.feed();
            randy.feed();
        } catch (CatAteTooMuchException e) {
            System.out.println("error feeding cat" + e);
        }

        System.out.println("Randy's new weight: " + randy.getWeight());

        Cat cartMan = new Cat("CartMan");
        System.out.println("Carti's weight is: " + cartMan.getWeight());
    }
}
