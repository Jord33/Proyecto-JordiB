package com.ironhack.project.accountTypes;

import java.math.BigDecimal;

public class CreditCard {
    // balance
    //A PrimaryOwner
    //An optional SecondaryOwner
    //A creditLimit
    //An interestRate
    //A penaltyFee
    private BigDecimal balance;
    private String primaryOwner;
    private String secondaryOwner;
    private BigDecimal creditLimit;
    private BigDecimal interestRate;
    private BigDecimal penaltyFee;

    public CreditCard(BigDecimal balance,
                      String primaryOwner, String secondaryOwner,
                      BigDecimal creditLimit, BigDecimal interestRate, BigDecimal penaltyFee) {
        this.balance = balance;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.creditLimit = creditLimit;
        this.interestRate = interestRate;
        this.penaltyFee = penaltyFee;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public String getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(String secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }
}
