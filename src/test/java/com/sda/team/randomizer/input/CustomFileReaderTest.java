package com.sda.team.randomizer.input;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CustomFileReaderTest {

    @Test
    void givenFilePath_whenLoadDataUsingNio_returnListOfStrings() {
        String filePath = "C:\\dev\\sda\\group11-team\\src\\test\\resources\\people.txt";
        List<String> expectedList = Arrays.asList("Cosmina Morar",
                "Greta Melneciuc");

        List<String> actualList = CustomFileReader.loadDataUsingNio(filePath);

        assertThat(actualList).isEqualTo(expectedList);
    }
}