package com.sda.team.at_work_work;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class IOChallenge {

    public static void main(String[] args) throws IOException {

        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("morcovi");
        shoppingList.add("cartofi");
        shoppingList.add("ridichi");
        shoppingList.add("castron");
        shoppingList.add("lingura");

        String path = "C:\\dev\\Files\\listaCumparaturi.txt";

        File listaCumparaturi = new File(path);
        FileWriter fileWriter = fileWriter = new FileWriter(listaCumparaturi, true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        appendProductsToFile(shoppingList, bufferedWriter);
        bufferedWriter.close();
    }

    public static void appendProductsToFile(List<String> shoppingList, BufferedWriter bufferedWriter) throws IOException {
        for (String product : shoppingList) {
            bufferedWriter.write(product + "\n");
        }
    }
}

