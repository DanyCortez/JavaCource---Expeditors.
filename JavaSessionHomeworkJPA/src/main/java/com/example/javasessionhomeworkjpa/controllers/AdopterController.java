package com.example.javasessionhomeworkjpa.controllers;

import com.example.javasessionhomeworkjpa.clases.Adopter;
import com.example.javasessionhomeworkjpa.service.AdopterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdopterController {

    @Autowired
    private AdopterService adopterService;

    public AdopterController(AdopterService adopterService) {
        this.adopterService = adopterService;
    }

    // Read operation
    @GetMapping("/adopters")
    public List<Adopter> get()
    {
        return adopterService.getAll();
    }
}
