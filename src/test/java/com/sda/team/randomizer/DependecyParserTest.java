package com.sda.team.randomizer;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DependencyParserTest {

    @Test
    public void givenLongDependencyName_whenToShortVersion_returnShortDependencyName() {
        final String longDependencyName = "compile group: 'com.google.guava', name: 'guava', version: '28.0-jre'";
        final String expectedDependencyName = "implementation 'com.google.guava:guava:28.0-jre'";

        String shortDependencyName = DependencyParser.toShortVersion(longDependencyName);

        assertThat(shortDependencyName).isEqualTo(expectedDependencyName);
    }

}