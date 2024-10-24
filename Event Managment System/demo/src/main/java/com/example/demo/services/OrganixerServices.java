package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.OrganizerRepo;
import com.example.demo.entity.Organizer;
import java.util.*;

@Component
public class OrganixerServices {
    
    @Autowired
    private OrganizerRepo organizerRepo;

    public Organizer newOrganizer(Organizer organizer)
    {
        Organizer org=this.organizerRepo.save(organizer);
        return org;
    }

    public Organizer organizerById(int id){
        Organizer organizer=this.organizerRepo.findById(id);
        return organizer;
    }

    public Organizer updateOrganizer(Organizer organizer)
    {
        Organizer org=this.organizerRepo.save(organizer);
        return org;
    }

    public Organizer deletOrganizerById(int id)
    {
        Organizer organizer=this.organizerRepo.deleteById(id);
        return organizer;
    }

    public void deletOrganizer(Organizer organizer)
    {
        this.organizerRepo.delete(organizer);
    }

    // public List<Event> eventByOrg(int id)
    // {
    //     List<Event> events=(List<Event>) this.organizerRepo.findById(id).getEvent();
    //     return events;
    // }



    public List<Organizer> allOrganizer()
    {
        List<Organizer> allOrgList=(List<Organizer>)this.organizerRepo.findAll();
        return allOrgList;
    }

}
