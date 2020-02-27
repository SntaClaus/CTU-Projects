//JD521_Brandon_Klindt_5261_FA3
package com.bklindt;

import javax.swing.*;
import java.lang.*;

public class enumDayMoodMain {
    public static void main(String[] args) {
        // The assignment way
        enumDayMood DayMood = new enumDayMood();
        String strDay = JOptionPane.showInputDialog ("Please enter a day (SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY)").toUpperCase();

        try {
            Day day = Day.valueOf(strDay);
            DayMood.tellDayMood(day);
        }catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null,e.getMessage(), "Illegal Argument Exception",JOptionPane.ERROR_MESSAGE);
            System.exit(0);
        }

        // "Idiot" proofing - better way
        /**
         Object choice = JOptionPane.showInputDialog(null,
         "Choose a day of the week", "Day Of The Week",
         JOptionPane.INFORMATION_MESSAGE, null,
         Day.values(), Day.values()[0]);
         Day day = Day.valueOf(choice.toString());
         **/

    }
}