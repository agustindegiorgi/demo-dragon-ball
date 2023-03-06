package com.example.demo.controller;

import com.example.demo.config.DragonBallConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/application-name")
public class ApplicationNameController {

    @Autowired
    private DragonBallConfig configuration;

    @GetMapping
    public ResponseEntity<String> getAppName() {
        return ResponseEntity.ok(configuration.getApplicationName());
    }

}
