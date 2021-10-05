package com.company;

import java.util.Scanner;
import java.util.Random;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.*;

public class Main {


    public static void tally(ArrayList<String> list) {
        Map<String, Integer> hm = new HashMap<String, Integer>();

        for (String i : list) {
            Integer j = hm.get(i);
            hm.put(i, (j == null) ? 1 : j + 1);
        }

        for (Map.Entry<String, Integer> val : hm.entrySet()) {
            System.out.println("Side " + val.getKey() + " " + "occurs" + ": " + val.getValue() + " times");
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");

        int diceSides = input.nextInt();

        System.out.println("How many times do you want to throw the dice?");

        int diceThrow = input.nextInt();
        Random random = new Random();
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i <= diceThrow; i++) {

            int valueOfDice = random.nextInt(diceSides);
            System.out.println("Your dice roll is " + valueOfDice);

            String diceList = Integer.toString(valueOfDice);

            list.add(diceList);

        }
        tally(list);
    }
}
