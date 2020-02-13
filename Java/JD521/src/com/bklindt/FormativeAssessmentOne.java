package com.bklindt;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FormativeAssessmentOne {
    // My own function due to the DRY "rule"
    public static void printArray(int[] array , String boxText){
        System.out.println("------------------------");
        System.out.println(boxText);
        int x = 0;
        for (int i : array) {
            System.out.println("arrayDragon[" + x + "] = " + i);
            x++;
        }
        System.out.println("------------------------\n");
    }

    public static void main(String[] args){

        // Welcome Message
        System.out.println("Welcome to Dragon Killer!!");

        // Scanner init
        Scanner scanner = new Scanner(System.in);

        // Gets name and surname as text input and removes all the white spaces before and after entry (trim)
        System.out.print("Please enter your name and surname : ");
        String name;
        name = scanner.nextLine().trim();

        // Removes all white spaces and stores the string in a new variable
        String nameSurname = name.replace(" ", "");

        // Stores the length into a new int variable
        int sizeOfFullName = nameSurname.length();
        System.out.println(nameSurname + " : has a length of [" + sizeOfFullName + "] characters");

        // Create an array the size of the int above
        int[] arrayDragon = new int[sizeOfFullName];

        // Loops through each item in the array and adds a random value between 10 and 50
        Random random = new Random();
        for (int i = 0 ; i < sizeOfFullName ; i++) {
            int randomInt = random.nextInt(40);
            arrayDragon[i] = randomInt + 10;
        }

        // Prints array items to console
        System.out.println(Arrays.toString(arrayDragon));
        Arrays.sort(arrayDragon);

        // Gets the number from the user
        System.out.print("Please choose a number in the array: ");
        int getNum = scanner.nextInt();
        int index = Arrays.binarySearch(arrayDragon,getNum);

        // Checks if the user guessed a number in the array.
        if (index < 0){
            System.out.println("The array does not have such a value. Program will now close");
        } else {
            arrayDragon[index] = 0;
            printArray(arrayDragon, "Sorted arrayDragon with removed item");
            System.out.println("The number " + getNum + " was removed at index=[" + index + "]");
        }
    }
}

