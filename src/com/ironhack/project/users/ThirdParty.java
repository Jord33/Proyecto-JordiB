package com.ironhack.project.users;

public class ThirdParty {

    private String name;
    private String hashedKey;

    public ThirdParty(String name, String hashedKey) {
        this.name = name;
        this.hashedKey = hashedKey;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHashedKey() {
        return hashedKey;
    }

    public void setHashedKey(String hashedKey) {
        this.hashedKey = hashedKey;
    }
}
