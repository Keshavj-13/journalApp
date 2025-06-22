package net.engineeringdigest.journalApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HeaalthCheak {

    @GetMapping("/health-check")
    public String healthcheak(){
        return "okay";
    }
}
