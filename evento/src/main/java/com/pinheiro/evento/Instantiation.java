package com.pinheiro.evento;

import com.pinheiro.evento.dtos.EventRequestDTO;
import com.pinheiro.evento.entities.Event;
import com.pinheiro.evento.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private EventService service;

    @Override
    public void run(String... args) throws Exception {

        EventRequestDTO newEvent1 = new EventRequestDTO(20, 2, "10/06/2024", "Festa do Guilherme", "Famosa festa anual do Guilherme");
        service.createEvent(newEvent1);

        EventRequestDTO newEvent2 = new EventRequestDTO(10, 0, "14/05/2024", "Hackaton Spring", "Grande evento que reune devs Java para fazer network");
        service.createEvent(newEvent2);

    }
}
