package com.bklindt;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestingInput {

    public static void main(String[] args){

        int firstNum, secondNum, total;
        String name;

        System.out.println("Please follow all instructions carefully.");
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        name = input.nextLine();

        System.out.println("Welcome " + name + "! You will now enter two numbers.");
        System.out.print("First number: ");
        firstNum = input.nextInt();

        System.out.print("Second number: ");
        secondNum = input.nextInt();

        total = firstNum + secondNum;

        System.out.println("The sum of the numbers = " + total);

        // Make it pop up with a dialog box - optional
        //JOptionPane.showMessageDialog(null, "The sum of the numbers = " + total);

    }
}
