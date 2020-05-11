package com.example.proiectMovies.controller;

import com.example.proiectMovies.model.Actor;
import com.example.proiectMovies.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class ActorsController {
    @Autowired
    private ActorService actorService;

    @PostMapping("/addActors")
    public String addActors(Actor actor) {
        actorService.addActors(actor);
        return "redirect:/";
    }
}
