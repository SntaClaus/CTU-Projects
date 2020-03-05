package com.ctu;

import javax.swing.*;
import java.text.NumberFormat;

public class CustomerFinance {

    public static void main(String[] args) {
        FinancePeriod financePeriod = new FinancePeriod();
        double getRepayAmount;
        double totalDue;

        financePeriod.setCustomerName();
        financePeriod.setCustomerNumber();
        financePeriod.setNumberMonths();
        financePeriod.setProductPrice();
        getRepayAmount = financePeriod.calculateRepayment();
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        totalDue = getRepayAmount * financePeriod.getNumberMonths();

        JOptionPane.showMessageDialog(null, "" +
                "Name: " + financePeriod.getCustomerName() + "\n" +
                "Number: " + financePeriod.getCustomerNumber() + "\n" +
                "Number of Months: " + financePeriod.getNumberMonths()+ "\n" +
                "Price: " + currency.format(financePeriod.getProductPrice()) + "\n" +
                "Monthly repayment: " + currency.format(getRepayAmount) + "\n" +
                "Total Due: " + currency.format(totalDue));
    }
}
