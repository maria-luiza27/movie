package com.example.proiectMovies.service;
import com.example.proiectMovies.dao.ActorsRepository;
import com.example.proiectMovies.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorService {
    @Autowired
    private ActorsRepository actorsRepository;

    public  void addActors(Actor actor) {
        actorsRepository.save(actor);
    }

    // This method is used to retrieve all movies from database and return them as a list
    public List<Actor> getAllActors() {
        List<Actor> actorList = new ArrayList<>();
        // Get all movies from database and save them in a moviesList object
        actorsRepository.findAll().iterator().forEachRemaining(actorList::add);
        return actorList;
}}

