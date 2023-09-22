package com.example.rso_java_dz;

import java.util.Date;

public class Event {
    private String id;
    private String ime;

    private Date date;

    public void setIme(String ime) {
        this.ime = ime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIme() {
        return ime;
    }

    public String getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }
}
