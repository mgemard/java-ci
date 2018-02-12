package fr.poe.ci.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("bonjour/{nom}")
    public String bonjour(@PathVariable("nom") String nom) {
        return "bonjour " + nom;
    }
}
