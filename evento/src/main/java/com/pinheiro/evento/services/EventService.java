package com.pinheiro.evento.services;

import com.pinheiro.evento.dtos.EmailRequestDTO;
import com.pinheiro.evento.dtos.EventRequestDTO;
import com.pinheiro.evento.entities.Event;
import com.pinheiro.evento.entities.Subscription;
import com.pinheiro.evento.exceptions.EventFullException;
import com.pinheiro.evento.exceptions.EventNotFoundException;
import com.pinheiro.evento.repositories.EventRepository;
import com.pinheiro.evento.repositories.SubscriptionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class EventService {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SubscriptionRepository subscriptionRepository;

    @Autowired
    private EmailServiceClient emailServiceClient;

    public List<Event> findAll(){
        return eventRepository.findAll();
    }

    public List<Event> getUpcomingEvents(){
        return eventRepository.findUpcomingEvent(LocalDateTime.now());
    }

    public Event createEvent(EventRequestDTO eventRequest){
        Event newEvent = new Event(eventRequest);
        return eventRepository.save(newEvent);
    }

    public void registerParticipant(String eventId, String participantEmail){
        Event event = eventRepository.findById(eventId).orElseThrow(EventNotFoundException::new);

            if(event.getRegisteredParticipants() >= event.getMaxParticipants()){
                throw new EventFullException();
            }
            
            Subscription subscription = new Subscription(event, participantEmail);

            subscriptionRepository.save(subscription);

            event.setRegisteredParticipants(event.getRegisteredParticipants() + 1);

            EmailRequestDTO emailRequest = new EmailRequestDTO(participantEmail, "Confirmação de inscrição", "Você foi inscrito no evento com sucesso!");

            emailServiceClient.sendEmail(emailRequest);
    }
}
