package com.sda.team.randomizer.utils;

import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DependencyParser {

    private static final Logger logger = Logger.getLogger(DependencyParser.class.getName());

    private static final String LONG_DEPENDENCY_PATTERN = "compile group: '(\\S*)', name: '(\\S*)', version: '(\\S*)'";

    public static String toShortVersion(String longDependencyName) {
        final Pattern pattern = Pattern.compile(LONG_DEPENDENCY_PATTERN, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(longDependencyName);

        String shortDependencyName = "";
        while (matcher.find()) {
            logger.info("Full match: " + matcher.group(0));
            shortDependencyName = ("implementation '" + matcher.group(1) + ":" + matcher.group(2) + ":" + matcher.group(3) + "'");
        }
        return shortDependencyName;
    }
}
