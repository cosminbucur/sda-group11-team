package com.sda.team.randomizer.addressBuilder;

public class Address {
    private String name;
    private String country;

    private Address(AddressBuilder builder) {
        this.name = builder.name;
        this.country = builder.country;

    }

    @Override
    public String toString() {
        return "Person: " + this.name +
                " locuieste in:" + this.country;
    }

    public static class AddressBuilder {
        private String name;
        private String country;

        public AddressBuilder name(String name) {
            this.name = name;
            return this;
        }

        public AddressBuilder country(String country) {
            this.country = country;
            return this;
        }


        public Address build() {
            Address user = new Address(this);

            return user;
        }

    }
}

