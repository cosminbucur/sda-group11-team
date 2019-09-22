package com.sda.team.randomizer;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomizerAppTest {

    @Test
    void givenListOfNames_whenSortPeopleByDifficulty_returnSortedList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("vlad", 1));
        people.add(new Person("laur", 4));
        people.add(new Person("cosmina", 3));
//                Arrays.asList(
//                new Person("vlad", 1),
//                new Person("laur", 4),
//                new Person("cosmina", 3));

        List<Person> expectedList = new ArrayList<>();
        expectedList.add(new Person("vlad", 1));
        expectedList.add(new Person("cosmina", 3));
        expectedList.add(new Person("laur", 4));

//                Arrays.asList(
//                new Person("vlad", 1),
//                new Person("cosmina", 3),
//                new Person("laur", 4));

        List<Person> actualList = RandomizerApp.sortPeopleByDifficulty(people);

        assertThat(actualList).isEqualTo(expectedList);
    }

    @Test
    void givenFilePath_whenLoadDataUsingNio_returnListOfStrings() {
        String filePath = "C:\\dev\\sda\\group11-team\\src\\test\\resources\\people.txt";
        List<String> expectedList = Arrays.asList("Cosmina Morar",
                "Greta Melneciuc");

        // list from file = this list
        List<String> actualList = RandomizerApp.loadDataUsingNio(filePath);

        assertThat(actualList).isEqualTo(expectedList);
    }
}