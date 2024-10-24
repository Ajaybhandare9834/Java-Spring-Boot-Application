package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Venue;


public interface VenuRepo extends CrudRepository<Venue,Integer>{
    public Venue findById(int id);
    public Venue deleteById(int id);
}
