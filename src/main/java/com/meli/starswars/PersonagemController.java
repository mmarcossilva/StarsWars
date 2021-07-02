package com.meli.starswars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonagemController {

    @Autowired
    private PersonagemService service;

    @GetMapping("/{name}")
    public ResponseEntity<List<Personagem>> get(@PathVariable String name){
        return new ResponseEntity<>(service.getPersonagensByName(name), HttpStatus.ACCEPTED);
    }
}
