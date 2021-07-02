package com.meli.starswars;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository repository;

    public List<Personagem> getPersonagensByName(String name){
        return repository.getList().stream().filter(personagem -> personagem.getName().contains(name)).collect(Collectors.toList());
    }
}
