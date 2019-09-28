package com.sda.team.randomizer;

import java.util.Scanner;

public class DemoConsent {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("insert from: accepted, rejected, pending");
        String inputMessage = input.nextLine();
//        System.out.println(ConsentType.typeOfConsent(inputMessage));
    }
}
