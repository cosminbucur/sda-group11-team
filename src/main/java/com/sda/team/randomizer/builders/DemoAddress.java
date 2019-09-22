package com.sda.team.randomizer.builders;

public class DemoAddress {
    public static void main(String[] args) {

        // tip rererinta = constructor . static class ()
        // .setter
        // .setter
        // .metoda din AddressBuilder
        Address address = new Address.AddressBuilder()
                .name("Laur seful la Java")
                .country("Bucharest")
                .build();
        System.out.println(address);

    }
}
