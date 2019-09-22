package com.sda.team.randomizer.addressBuilder;

public class DemoAddress {
    public static void main(String[] args) {

        Address address = new Address.AddressBuilder().name("Laur seful la Java")
                .country("Bucharest")
                .build();
        System.out.println(address);

    }
}
