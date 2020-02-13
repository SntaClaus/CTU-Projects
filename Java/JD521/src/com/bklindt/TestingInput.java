package com.bklindt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestingInput {

    public static void main(String[] args){

        int count;
        String name;

        System.out.println("Please follow all instructions carefully.");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = scanner.nextLine();
        count = name.length();

        // Create an array the size of the int above
        int[] arrayDragon = new int[count];

        // Loops through each item in the array and adds a random value between 10 and 50
        Random random = new Random();
        for (int i = 0 ; i < count ; i++){
            int randomInt = random.nextInt(40);
            arrayDragon[i] = randomInt + 10;
        }

        System.out.println(Arrays.toString(arrayDragon));

        int numberChoice;
        System.out.print("Choose a number: ");
        numberChoice = scanner.nextInt();

        for (int i : arrayDragon) {
            System.out.println(i);
        }


    }
}
