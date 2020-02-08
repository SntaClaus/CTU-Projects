package com.bklindt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FormativeAssessmentOne {

    public static void main(String[] args){

        // Generic Welcome Message
        System.out.println("Welcome to dragon what what.");

        // Scanner init
        Scanner scanner = new Scanner(System.in);

        // Gets name and surname as text input and removes all the white spaces before and after entry (trim)
        System.out.print("Please enter your name: ");
        String name;
        name = scanner.nextLine().trim();

        // Removes all white spaces and stores the string in a new variable
        String nameSurname = name.replace(" ", "");

        // Stores the length into a new int variable
        System.out.println(nameSurname);
        int sizeOfFullName = nameSurname.length();

        // Create an array the size of the int above
        int[] arrayDragon = new int[sizeOfFullName];

        // Loops through each item in the array and adds a random value between 10 and 50
        Random random = new Random();
        int x = 0;
        while (x != (sizeOfFullName)) {
            int randomInt = random.nextInt(40);
            arrayDragon[x] = randomInt + 10;
            x++;
        }

        // Prints array items
        System.out.println(Arrays.toString(arrayDragon));
        Arrays.sort(arrayDragon);
        System.out.println(Arrays.toString(arrayDragon));

    }
}
