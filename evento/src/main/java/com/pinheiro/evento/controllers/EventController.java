package com.pinheiro.evento.controllers;

import com.pinheiro.evento.dtos.EventRequestDTO;
<<<<<<< HEAD
import com.pinheiro.evento.dtos.SubscriptionRequestDTO;
import com.pinheiro.evento.entities.Event;
import com.pinheiro.evento.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
=======
import com.pinheiro.evento.entities.Event;
import com.pinheiro.evento.services.EventService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> fa5548957222fd23503ab0c94e10434153d37672
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/events")
public class EventController {

    @Autowired
<<<<<<< HEAD
    private EventService eventService;

    @GetMapping
    public List<Event> getAllEvents() {
        return eventService.getAllEvents();
    }

    @GetMapping("/upcoming")
    public List<Event> getUpcomingEvents() {
        return eventService.getUpcomingEvents();
    }

    @PostMapping
    public Event createEvent(@RequestBody EventRequestDTO event) {
        return eventService.createEvent(event);
    }

    @PostMapping("/{eventId}/register")
    public ResponseEntity<String> registerParticipant(@PathVariable String eventId, @RequestBody SubscriptionRequestDTO subscriptionRequest) {
        eventService.registerParticipant(eventId, subscriptionRequest.participantEmail());
        return ResponseEntity.ok("Event created successfully");
    }
}
=======
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
>>>>>>> fa5548957222fd23503ab0c94e10434153d37672
