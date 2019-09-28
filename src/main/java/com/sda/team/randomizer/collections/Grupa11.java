package com.sda.team.randomizer.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grupa11 {
    private String name;
    private String gendre;

    public Grupa11(String name, String gendre) {
        this.name = name;
        this.gendre = gendre;
    }

    public static void main(String[] args) {
        List<Grupa11> grupa11 = new ArrayList<>(Arrays.asList(
                new Grupa11("Laur Vasile", "M"),
                new Grupa11("Greta Halep", "F"),
                new Grupa11("Vlad Ionescu", "M")

        ));

        Map<String, String> map1 = grupa11.stream().collect(Collectors.toMap(Grupa11::getGendre, Grupa11::getName));
        for (String key : map1.keySet()) {
            System.out.println(key + " : " + map1.get(key));
        }
        // map1.entrySet().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));


    }

    public String getName() {
        return name;
    }

    public String getGendre() {
        return gendre;
    }


}

