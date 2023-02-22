package com.ironhack.project.users;

import com.ironhack.project.address.Address;

import java.util.Date;

public class AccountHolders extends User{
    private String name;
    private Date dateOfBirth;
    private Address primaryAddress;
    private String mailingAddress;

    public AccountHolders(String id, String username, String password,
                          String name, Date dateOfBirth,
                          Address primaryAddress, String mailingAddress) {
        super(id, username, password);
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.primaryAddress = primaryAddress;
        this.mailingAddress = mailingAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Address getPrimaryAddress() {
        return primaryAddress;
    }

    public void setPrimaryAddress(Address primaryAddress) {
        this.primaryAddress = primaryAddress;
    }

    public String getMailingAddress() {
        return mailingAddress;
    }

    public void setMailingAddress(String mailingAddress) {
        this.mailingAddress = mailingAddress;
    }
}
