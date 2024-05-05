package com.pinheiro.evento.controllers;

import com.pinheiro.evento.dtos.EventRequestDTO;
import com.pinheiro.evento.entities.Event;
import com.pinheiro.evento.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
    private EventService service;

    @GetMapping
    public List<Event> findAll(){
        return service.findAll();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents(){
        return service.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO newEvent){
        return service.createEvent(newEvent);
    }
}
