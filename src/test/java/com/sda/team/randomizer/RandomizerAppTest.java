package com.sda.team.randomizer;

import com.sda.team.randomizer.model.Person;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class RandomizerAppTest {

    @Test
    void givenListOfNames_whenSortPeopleByDifficulty_returnSortedList() {
        Person vlad = new Person("vlad", 1);
        Person laur = new Person("laur", 4);
        Person cosmina = new Person("cosmina", 3);
//        List<Person> people = Arrays.asList(vlad, laur, cosmina);
        List<Person> people = Arrays.asList(
                new Person("vlad", 1),
                new Person("laur", 4),
                new Person("cosmina", 3));

//        List<Person> expectedList = Arrays.asList(vlad, cosmina, laur);
        List<Person> expectedList = Arrays.asList(
                new Person("vlad", 1),
                new Person("cosmina", 3),
                new Person("laur", 4)
        );

        List<Person> actualList = RandomizerApp.sortPeopleByDifficulty(people);

        assertThat(actualList).isEqualTo(expectedList);
    }
}