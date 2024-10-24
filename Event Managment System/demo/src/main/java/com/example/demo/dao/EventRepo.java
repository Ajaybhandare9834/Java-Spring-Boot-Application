package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Event;
import com.example.demo.entity.Organizer;
import com.example.demo.entity.Venue;

import java.util.List;



public interface EventRepo extends CrudRepository<Event,Integer> {
    public Event  findById(int id);
    public Event deleteById(int id);

    public List<Event> findByOrganizer(Organizer organizer);
    public List<Event> findByVenue(Venue venue);
}
