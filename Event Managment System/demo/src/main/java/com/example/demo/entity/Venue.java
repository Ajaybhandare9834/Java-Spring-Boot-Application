package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Venue {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String name;
    private String location;
    private String capacity;

    @OneToOne(mappedBy = "venue")
    private Event event;

    public Venue(int id, String name, String location, String capacity) 
    {
        this.id = id;
        this.name = name;
        this.location = location;
        this.capacity = capacity;
    }
    public Venue(int id) 
    {
        this.id = id;
    }

    public Venue()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    // public Event getEvent() {
    //     return event;
    // }

    public void setEvent(Event event) {
        this.event = event;
    }

    // @Override
    // public String toString() {
    //     return "Venue [id=" + id + ", name=" + name + ", location=" + location + ", capacity=" + capacity + ", event="
    //             + event + "]";
    // }

  
    
    

}
