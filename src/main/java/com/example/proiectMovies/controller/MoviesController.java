package com.example.proiectMovies.controller;

import com.example.proiectMovies.model.Movies;
import com.example.proiectMovies.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@Controller
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @GetMapping("/")
    public String main(Model model) {
        List<Movies> movies = moviesService.getAllMovies();

        model.addAttribute("movies", movies);

        return "index";
    }
}
