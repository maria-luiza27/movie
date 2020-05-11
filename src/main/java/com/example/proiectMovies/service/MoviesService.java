package com.example.proiectMovies.service;

import com.example.proiectMovies.dao.MoviesRepository;
import com.example.proiectMovies.model.Movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository moviesRepository;
    // This method is used to retrieve all movies from database and return them as a list
    public List<Movies> getAllMovies() {
        List<Movies> moviesList = new ArrayList<>();
        // Get all movies from database and save them in a moviesList object
        moviesRepository.findAll().iterator().forEachRemaining(moviesList::add);
        return moviesList;
    }
}
