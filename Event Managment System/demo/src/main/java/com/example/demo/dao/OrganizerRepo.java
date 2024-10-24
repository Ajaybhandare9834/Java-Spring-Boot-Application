package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Organizer;


public interface OrganizerRepo extends CrudRepository<Organizer,Integer> {
    public Organizer findById(int id);
    public Organizer deleteById(int id);
}
