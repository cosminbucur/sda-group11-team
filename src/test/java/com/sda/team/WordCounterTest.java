package com.sda.team;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class WordCounterTest {

    @Test
    public void countWordOccurrence() throws Exception {
        // create path
        Path path = Paths.get("C:\\dev\\sda\\group11-team\\src\\test\\resources\\words.txt");
        WordCounter wordCounter = new WordCounter();
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("ana", 2);
        expectedMap.put("alex", 1);

        // when
        Map<String, Integer> actualMap = wordCounter.countWordOccurrence(path);

        // then
        assertThat(actualMap).isEqualTo(expectedMap);
    }
}