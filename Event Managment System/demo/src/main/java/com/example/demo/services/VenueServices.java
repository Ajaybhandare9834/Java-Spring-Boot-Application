package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.VenuRepo;
import com.example.demo.entity.Venue;

@Component
public class VenueServices {
    
    @Autowired
    private VenuRepo venuRepo;

    public Venue newVenue(Venue venue)
    {
        Venue venue2=this.venuRepo.save(venue);
        return venue2;
    }

    public Venue venueById(int id)
    {
        Venue venue=this.venuRepo.findById(id);
        return venue;
    }

    public Venue updateVenue(Venue venue)
    {
        Venue venue2=this.venuRepo.save(venue);
        return venue2;
    }

    public Venue deletVenueById(int id)
    {
        Venue venue=this.venuRepo.deleteById(id);
        return venue;
    }

    public void deletVenue(Venue venu)
    {
        this.venuRepo.delete(venu);
    }


}
