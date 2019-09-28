package com.sda.team.randomizer.builders;

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
                " lives in:" + this.country;
    }

    // nested builder
    public static class AddressBuilder {
        // same fields as object to be constructed
        private String name;
        private String country;

        // fluent setter
        public AddressBuilder name(String name) {
            this.name = name;
            // return this address builder with a name
            return this;
        }

        // fluent setter
        public AddressBuilder country(String country) {
            this.country = country;
            // return this address builder with a country
            return this;
        }

        // build an address based on builder instance
        public Address build() {
            return new Address(this);
        }
    }
}

