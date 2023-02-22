package com.ironhack.project.accountTypes;

import com.ironhack.project.Enums.Status;

import java.math.BigDecimal;
import java.util.Date;

public class Checking extends Account{
    private BigDecimal minimumBalance;
    private BigDecimal monthlyMaintenanceFee;


    public Checking(BigDecimal balance, String primaryOwner, String secondaryOwner, BigDecimal penaltyFee,
                    BigDecimal minimumBalance, BigDecimal monthlyMaintenanceFee, Date creationDate,
                    Status status, String secretKey) {
        super(balance, secretKey, primaryOwner, secondaryOwner, penaltyFee, creationDate, status);
        this.minimumBalance = minimumBalance;
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
    }

    public BigDecimal getMinimumBalance() {
        return minimumBalance;
    }

    public void setMinimumBalance(BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    public BigDecimal getMonthlyMaintenanceFee() {
        return monthlyMaintenanceFee;
    }

    public void setMonthlyMaintenanceFee(BigDecimal monthlyMaintenanceFee) {
        this.monthlyMaintenanceFee = monthlyMaintenanceFee;
    }
}
