package com.ironhack.project.accountTypes;

import com.ironhack.project.Enums.Status;

import java.math.BigDecimal;
import java.util.Date;

public class Savings extends Account{

    private BigDecimal minimumBalance;
    private BigDecimal interestRate;
    public Savings(BigDecimal balance, String primaryOwner, String secondaryOwner, BigDecimal penaltyFee,
                   String secretKey, Date creationDate, Status status) {
        super(balance, secretKey, primaryOwner, secondaryOwner, penaltyFee, creationDate, status);
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(BigDecimal interestRate) {
        this.interestRate = interestRate;
    }
}
