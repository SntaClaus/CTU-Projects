package com.bklindt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FomativeAssessmentOne {

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

        System.out.println(nameSurname);
        int sizeOfFullName = nameSurname.length();

        int[] arrayDragon = new int[sizeOfFullName];

        Random random = new Random();
        int x = 0;
        while (x != (sizeOfFullName)) {
            int randomInt = random.nextInt(40);
            arrayDragon[x] = randomInt + 10;
            x++;
        }

        System.out.println(Arrays.toString(arrayDragon));
        Arrays.sort(arrayDragon);
        System.out.println(Arrays.toString(arrayDragon));

    }
}
