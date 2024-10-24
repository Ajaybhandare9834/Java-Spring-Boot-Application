package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Event;
import com.example.demo.entity.Organizer;
import com.example.demo.entity.Venue;
import com.example.demo.services.EventServices;
import com.example.demo.services.OrganixerServices;
import com.example.demo.services.VenueServices;

import java.util.*;


@RestController
public class MainController {
    
    @Autowired
    private EventServices eventServices;

    @Autowired
    private OrganixerServices organixerServices;

    @Autowired
    private VenueServices venueServices;

    @PostMapping("/OrgAdd")
    public Organizer new_org_add(@RequestBody Organizer organizer)
    {
        Organizer ooo=new Organizer();
        ooo.setEvent(organizer.getEvent());
        ooo.setContactInfo(organizer.getContactInfo());
        ooo.setId(organizer.getId());
        ooo.setName(organizer.getName());
        Organizer org=organixerServices.newOrganizer(organizer);
        return org;
    }

    @GetMapping("/Org/{id}")
    public Organizer get_org_by_id(@PathVariable int id)
    {
        Organizer organizer=organixerServices.organizerById(id);
        return organizer;
    }

    @PutMapping("/updateOrg")
    public Organizer update_org(@RequestBody Organizer organizer)
    {
        Organizer org=organixerServices.newOrganizer(organizer);
        return org;
    }

    @DeleteMapping("/deletOrg")
    public String delete_org(@RequestBody Organizer organizer)
    {
        organixerServices.deletOrganizer(organizer);
        return "organizer deleted sucesfully";
    }

    @DeleteMapping("/deletOrgById/{id}")
    public Organizer delete_org_by_id(@PathVariable int id)
    {
        Organizer organizer=organixerServices.deletOrganizerById(id);
        return organizer;
    }




    @PostMapping("/VenueAdd")
    public Venue new_Venue_add(@RequestBody Venue venue)
    {
        Venue vnu=venueServices.newVenue(venue);
        return vnu;
    }

    @GetMapping("/Venue/{id}")
    public Venue get_Venue_by_id(@PathVariable int id)
    {
        Venue venue=venueServices.venueById(id);
        return venue;
    }

    @PutMapping("/updateVenue")
    public Venue update_Venue(@RequestBody Venue venue)
    {
        Venue vnu=venueServices.updateVenue(venue);
        return vnu;
    }

    @DeleteMapping("/deletVenue")
    public String delete_Venue(@RequestBody Venue venue)
    {
        venueServices.deletVenue(venue);
        return "Venue deleted sucesfully";
    }

    @DeleteMapping("/deletVenueById/{id}")
    public Venue delete_Venue_by_id(@PathVariable int id)
    {
        Venue venue=venueServices.deletVenueById(id);
        return venue;
    }

    @PostMapping("/EvntAdd")
    public Event new_Event_add(@RequestBody Event event)
    {
        Event event2=eventServices.newEvent(event);
        return event2;
    }


    @GetMapping("/AllEvnt")
    public List<Event> all_Event()
    {
        List<Event> events=eventServices.allEvent();
        return events;
    }

    @GetMapping("/Event/{id}")
    public Event get_Event_by_id(@PathVariable int id)
    {
        Event event=eventServices.eventById(id);
        return event;
    }

    @PutMapping("/updateEvent")
    public Event update_event(@RequestBody Event event)
    {
        Event evt=eventServices.updateEvent(event);
        return evt;
    }
    
    @DeleteMapping("/deletEventById/{id}")
    public Event delete_Event_by_id(@PathVariable int id)
    {
        Event event=eventServices.deleteEventById(id);
        return event;
    }

    @GetMapping("/EvntByVenue/{id}")
    public List<Event> event_By_Venue(@PathVariable int id)
    {
        List<Event> events=(List<Event>) eventServices.getEventByVenue(new Venue(id));
        return events;
    }

    @GetMapping("/EvntByOrganizer/{id}")
    public List<Event> event_By_Org(@PathVariable int id)
    {
        List<Event> events=(List<Event>) eventServices.getEventByOrganizer(new Organizer(id));
        return events;
    }


    @GetMapping("/AllOrg")
    public List<Organizer> allOrg()
    {
        List<Organizer> List=organixerServices.allOrganizer();
        return List;
    }


    @PostMapping("/Add")
    public Event add()
    {
        Event e=new Event();
        // e.setId(62);
        e.setEventName("gggg");
        e.setEventDate("0gggg");
        e.setDescription("Ligggggggga");

        Organizer o=new Organizer();
        o.setName("Aggggg");
        o.setId(88889);
        o.setContactInfo("ggggg5");
        e.setOrganizer(o);


        List<Event> evn=new ArrayList<>();
        evn.add(e);
        o.setEvent(evn);

        Venue v=new Venue();
        // v.setId(72);
        v.setName("powerlooma");
        v.setLocation("kharpudi");
        v.setCapacity("Big");

        v.setEvent(e);
        e.setVenue(v);

        organixerServices.newOrganizer(o);
        return e;
    }

}
