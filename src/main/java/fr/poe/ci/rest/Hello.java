package fr.poe.ci.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hi/{nom}")
    public String hi(@PathVariable("nom") String name) {
        return "hi " + nom;
    }
}
