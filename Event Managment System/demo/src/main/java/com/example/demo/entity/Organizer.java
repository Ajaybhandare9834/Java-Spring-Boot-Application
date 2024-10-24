package com.example.demo.entity;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.*;
@Entity
public class Organizer {
    
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String name;
    private String contactInfo;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Event> event;
    
    

    public Organizer(int id, String name, String contactInfo, List<Event> event) {
        this.id = id;
        this.name = name;
        this.contactInfo = contactInfo;
        this.event = event;
    }

    public Organizer(int id) {
        this.id = id;
    }

    public Organizer() {
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

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<Event> getEvent() {
        return event;
    }

    public void setEvent(List<Event> event) {
        this.event = event;
    }



    
    
}
