package com.example.rso_java_dz;
import java.util.ArrayList;

public class EventList {

    private String id;
    private String date;

    private ArrayList<Event> events;

    private int timeDiff;

    public EventList (String id) {
        this.id = id;
        events = new ArrayList<Event>();
        timeDiff = Integer.MAX_VALUE;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    private int CalcTimeDiff(Event e){
        return 0;
    }

    public void add (Event event){
        events.add(event);
    }

    public ArrayList<Event> getEvents(){
        return events;
    }

    public void setEvents(ArrayList<Event> events) {
        this.events = events;
    }

    public int getTimeDiff() {
        return timeDiff;
    }

    public void setTimeDiff(int timeDiff) {
        this.timeDiff = timeDiff;
    }
}

