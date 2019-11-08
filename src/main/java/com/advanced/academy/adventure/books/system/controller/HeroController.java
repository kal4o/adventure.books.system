package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.model.adventure.Hero;
import com.advanced.academy.adventure.books.system.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hero")
public class HeroController {


    private final HeroService heroService;

    @Autowired
    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }


    @GetMapping(value = "list/customer/{customerId}")
    public List<Hero> getHeroList(@PathVariable("customerId") Integer customerId) {
        return heroService.getHeroesByCustomer(customerId);
    }

    @GetMapping(value = "/{heroId}")
    public Hero getHero(@PathVariable("heroId") Integer heroId) {
        return heroService.getHeroById(heroId);
    }
}
