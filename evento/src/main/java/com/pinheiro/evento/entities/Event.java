package com.pinheiro.evento.entities;

import com.pinheiro.evento.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity(name = "events")
@Table(name="events")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO eventRequest){
        this.date = eventRequest.date();
        this.maxParticipants = eventRequest.maxParticipants();
        this.registeredParticipants = eventRequest.registeredParticipants();
        this.title = eventRequest.title();
        this.description = eventRequest.description();
    }
}