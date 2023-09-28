package com.example.rso_java_dz;

import java.util.Date;

public class User {
    private String id;
    private String ime;

    private String password;

    public void setId(String id) {
        this.id = id;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getPassword() {
        return password;
    }
}

