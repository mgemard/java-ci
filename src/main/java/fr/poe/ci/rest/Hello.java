package fr.poe.ci.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @GetMapping("hello/{name}")
    public String hi(@PathVariable("name") String name) {
        return "hi " + name;
    }
}
