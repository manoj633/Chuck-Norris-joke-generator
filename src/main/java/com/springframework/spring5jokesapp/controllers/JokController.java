package com.springframework.spring5jokesapp.controllers;

import com.springframework.spring5jokesapp.services.JokeService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class JokController {

    private final JokeService jokeService;

    public JokController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping({"/",""})
    public String showJoke(Model model) {
        model.addAttribute("joke",jokeService.getJoke());
        return "index";
    }
}
