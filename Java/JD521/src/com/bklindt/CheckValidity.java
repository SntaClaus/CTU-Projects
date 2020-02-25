package com.bklindt;

import javax.swing.*;

public class CheckValidity {
    //JD521_Brandon_Klindt_5261_FA2
    public static String CheckValidEntry(String inputMessage , String errMessage){
        boolean bool;
        String text = null;

        do {
            text = JOptionPane.showInputDialog(inputMessage);
            try {
                bool = false;
                Integer.parseInt(text);
            }
            catch (NumberFormatException e){
                bool = true;
                JOptionPane.showMessageDialog(null, errMessage ,"ERROR" , JOptionPane.ERROR_MESSAGE);
                System.out.println("ERROR (INCORRECT INPUT) => " + e.getMessage());
            }
        }
        while (bool);

        return text;
    }
    // Overload of CheckValidEntry above
    public static String CheckValidEntry(String inputMessage , int maxRange){
        String text = null;
        var possibilities = new String[maxRange];
        for (int i = 0; i < maxRange; i++) {
            possibilities[i] = Integer.toString(i+1);
        }
        text = (String)JOptionPane.showInputDialog(null, inputMessage, "Select number" , JOptionPane.INFORMATION_MESSAGE , null ,possibilities , "Choose");

        return text;
    }
}
