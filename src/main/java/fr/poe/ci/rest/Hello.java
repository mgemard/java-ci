package fr.poe.ci.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@GetMapping("hi/{name}")
	public String hi(@PathVariable("name") String name) {
		return "hi " + name;
	}
	
	@GetMapping("salut/{nom}")
	public String salut(@PathVariable("nom") String nom) {
		return "Salut " + nom;
	}


	@GetMapping("bonjour/{nom}")
	public String bonjour(@PathVariable("nom") String nom) {
		return "Bonjour " + nom;
	}
}
