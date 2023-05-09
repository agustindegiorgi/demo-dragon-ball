package com.example.demo.controller;

import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/dragon-ball/characters")
public class DragonBallController {

    private final Faker faker = new Faker();
    private List<String> characters = new ArrayList<>();

    @PostConstruct
    public void init() {
        for (int i = 0; i < 20; i++) {
            characters.add(faker.dragonBall().character());
        }
    }

    @GetMapping
    public ResponseEntity<List<String>> get() {
        return ResponseEntity.ok(characters);
    }
}