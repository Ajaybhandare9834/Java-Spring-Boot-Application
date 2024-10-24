package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.EventRepo;
import com.example.demo.entity.Event;
import com.example.demo.entity.Organizer;
import com.example.demo.entity.Venue;

import java.util.*;

@Component
public class EventServices {
    
    @Autowired
    private EventRepo eventRepo;

    

    public Event newEvent(Event event)
    {
        return this.eventRepo.save(event);
    }

    public List<Event> allEvent()
    {
        List<Event> events=(List<Event>) this.eventRepo.findAll();
        return events;
    }

    public Event eventById(int id)
    {
        Event event=this.eventRepo.findById(id);
        return event;
    }

    public Event updateEvent(Event event)
    {
        Event ev=this.eventRepo.save(event);
        return ev;
    }

    public Event deleteEventById(int id)
    {
        Event event=this.eventRepo.deleteById(id);
        return event;
    }

    public void deleteEvent(Event event)
    {
        this.eventRepo.delete(event);
    }

    public List<Event> getEventByOrganizer(Organizer organizer)
    {
        return this.eventRepo.findByOrganizer(organizer);
        
    }

    public List<Event> getEventByVenue(Venue venue)
    {
        return this.eventRepo.findByVenue(venue);
        
    }

    

}
