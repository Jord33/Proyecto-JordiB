package com.ironhack.project.accountTypes;

import com.ironhack.project.Enums.Status;

import java.math.BigDecimal;
import java.util.Date;

public class StudentChecking extends Account{

    public StudentChecking(BigDecimal balance, String primaryOwner,
                           String secondaryOwner, BigDecimal penaltyFee,
                           String secretKey, Date creationDate, Status status) {
        super(balance, secretKey, primaryOwner, secondaryOwner, penaltyFee, creationDate, status);
    }
}