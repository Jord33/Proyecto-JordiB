package com.ironhack.project.accountTypes;

import com.ironhack.project.Enums.Status;

import java.math.BigDecimal;
import java.util.Date;

public abstract class Account {
    private BigDecimal balance;
    private String secretKey;
    private String primaryOwner;
    private String secondaryOwner;
    private BigDecimal penaltyFee;
    private Date creationDate;
    private Status status;

    public Account(BigDecimal balance, String secretKey, String primaryOwner, String secondaryOwner,
                   BigDecimal penaltyFee, Date creationDate, Status status) {
        this.balance = balance;
        this.secretKey = secretKey;
        this.primaryOwner = primaryOwner;
        this.secondaryOwner = secondaryOwner;
        this.penaltyFee = penaltyFee;
        this.creationDate = creationDate;
        this.status = status;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getprimaryOwner() {
        return primaryOwner;
    }

    public void setprimaryOwner(String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public String getSecondaryOwner() {
        return secondaryOwner;
    }

    public void setSecondaryOwner(String secondaryOwner) {
        this.secondaryOwner = secondaryOwner;
    }

    public BigDecimal getPenaltyFee() {
        return penaltyFee;
    }

    public void setPenaltyFee(BigDecimal penaltyFee) {
        this.penaltyFee = penaltyFee;
    }public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public String getPrimaryOwner() {
        return primaryOwner;
    }

    public void setPrimaryOwner(String primaryOwner) {
        this.primaryOwner = primaryOwner;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
