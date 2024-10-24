package com.example.demo.entity;



import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Event {
    
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private int id;
    private String eventName;
    private String eventDate;
    private String description;


    @OneToOne(cascade = CascadeType.ALL)
    private Venue venue;

    @ManyToOne(cascade = CascadeType.ALL)
    private Organizer organizer;

   

    public Event( int id, String eventName, String eventDate,String description)
    {
        this.id=id;
        this.eventName=eventName;
        this.eventDate=eventDate;
        this.description=description;
    }

    public Event( int id)
    {
        this.id=id;
    }

    public Event()
    {
        super();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    // public Organizer getOrganizer() {
    //     return organizer;
    // }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    


   
    
    
    
}
