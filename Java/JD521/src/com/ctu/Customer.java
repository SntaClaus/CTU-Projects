package com.ctu;

import javax.swing.*;

public class Customer {
    private String customerName;
    private String customerNumber;
    private double productPrice;
    private int numberMonths;
    private Object[] arrNumberMonths = {1,2,3,4,5,6,7,8,9,10,11,12};

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public int getNumberMonths() {
        return numberMonths;
    }

    public void setCustomerName() {
        this.customerName = JOptionPane.showInputDialog("Name");
    }

    public void setCustomerNumber() {
        this.customerNumber = JOptionPane.showInputDialog("Number");
    }

    public void setProductPrice() {
        this.productPrice = Double.parseDouble(JOptionPane.showInputDialog("Price"));
    }

    public void setNumberMonths() {
        this.numberMonths = Integer.parseInt(JOptionPane.showInputDialog(null,"Months","Enter months",
                JOptionPane.PLAIN_MESSAGE, null, arrNumberMonths, arrNumberMonths[0]).toString());
    }

    public double calculateRepayment(){
        return 0;
    }
}
