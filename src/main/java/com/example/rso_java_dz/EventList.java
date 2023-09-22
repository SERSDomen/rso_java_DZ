package com.example.rso_java_dz;

import java.util.ArrayList;

public class EventList {
    private String id;
    private String ime;

    private ArrayList<Event> dogodki;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }



    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getIme() {
        return ime;
    }
}

