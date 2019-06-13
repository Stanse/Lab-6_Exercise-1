package com.mybank.domain;

public class SavingAccount extends Account {

    private double interestRate;

    public SavingAccount(double aInitBalance, double aInterestRate){
        super(aInitBalance);
        interestRate = aInterestRate;
    }

}
