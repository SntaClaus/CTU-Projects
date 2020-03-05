package com.ctu;

public class FinancePeriod extends Customer {

    @Override
    public double calculateRepayment(){
        double result = 0D;
        double pPrice = getProductPrice();
        int aMonth = getNumberMonths();

        if (aMonth < 4){
            result = pPrice / aMonth;
        }else{
            double before = (pPrice / aMonth);
            result = (before * 0.25) + before;
        }

        return result;
    }
}
