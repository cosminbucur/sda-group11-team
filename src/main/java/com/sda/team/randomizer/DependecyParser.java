package com.sda.team.randomizer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//dependency parser
//compile group: 'com.google.guava', name: 'guava', version: '28.0-jre'
//to
//implementation 'com.google.guava:guava:28.0-jre'

public class DependecyParser {

    public static void main(String[] args) {
        final String regex = "compile group: (''), name: (''), version: ('')";

        final String string = "compile group: 'com.google.guava', name: 'guava', version: '28.0-jre'\n"
                + "compile group: 'com.google.guava', name: 'junit', version: '28.0-jre'";

        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);

        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }


    }
}
