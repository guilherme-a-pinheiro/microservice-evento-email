package com.pinheiro.evento.entities;

import com.pinheiro.evento.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "event")
@Table(name = "events")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private int maxParticipants;
    private int registeredParticipants;
    private String date;
    private String title;
    private String description;

    public Event(EventRequestDTO dto){
        this.date = dto.date();
        this.maxParticipants = dto.maxParticipants();
        this.registeredParticipants = dto.registeredParticipants();
        this.title = dto.title();
        this.description = dto.description();
    }
}
