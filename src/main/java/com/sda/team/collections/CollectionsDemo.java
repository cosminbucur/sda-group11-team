package com.sda.team.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<Student> student = new ArrayList<>(Arrays.asList(
                new Student("Laur Vasile", "M"),
                new Student("Greta Halep", "F"),
                new Student("Vlad Ionescu", "M")
        ));

        Map<String, String> studentMap = convertListToMap(student);

        printListItems(studentMap);
    }

    private static void printListItems(Map<String, String> studentMap) {
        for (String key : studentMap.keySet()) {
            System.out.println(key + " : " + studentMap.get(key));
        }
    }

    private static Map<String, String> convertListToMap(List<Student> student) {
        return student
                .stream().collect(Collectors.toMap(Student::getGender, Student::getName));
    }

    // TODO:
    private static void iterateMapUsingLambda(Map<String, String> studentMap) {
        // studentMap.entrySet().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
    }
}
