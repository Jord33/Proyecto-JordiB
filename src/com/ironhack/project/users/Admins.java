package com.ironhack.project.users;

public class Admins extends User{

    private String name;

    public Admins(String id, String username, String password, String name) {
        super(id, username, password);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
