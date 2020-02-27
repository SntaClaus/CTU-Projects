//JD521_Brandon_Klindt_5261_FA3
package com.bklindt;

import javax.swing.*;

public class enumDayMood {

    public void tellDayMood(Day day){
        switch (day) {
            case MONDAY:
                JOptionPane.showMessageDialog (null, "Mondays are bad.");
                break;
            case FRIDAY:
                JOptionPane.showMessageDialog (null, "Fridays are better.");
                break;

            case SATURDAY: case SUNDAY:
                JOptionPane.showMessageDialog (null, "Weekends are best.");
                break;

            default:
                JOptionPane.showMessageDialog (null, "Midweek days are so-so.");
                break;
        }
    }
}