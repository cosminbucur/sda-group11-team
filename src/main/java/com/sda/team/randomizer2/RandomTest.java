package com.sda.team.randomizer2;

import java.util.Scanner;

public class RandomTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("insert range");
        int min = input.nextInt();
        int max = input.nextInt();


        int random = RandomizerOldApp.getRandomDifficulty(min, max);
        System.out.println(random);
        RandomizerOldApp randomizerRefference = new RandomizerOldApp();
        randomizerRefference.hello();
    }
}
