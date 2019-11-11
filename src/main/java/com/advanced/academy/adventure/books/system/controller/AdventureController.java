package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.model.adventure.Adventure;
import com.advanced.academy.adventure.books.system.service.AdventureService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/adventure")
public class AdventureController {

    private final AdventureService adventureService;

    public AdventureController(AdventureService adventureService) {
        this.adventureService = adventureService;
    }

    @PostMapping
    public void createOrUpdate(@RequestBody Adventure adventure) {
        adventureService.createOrUpdate(adventure);
    }

}
