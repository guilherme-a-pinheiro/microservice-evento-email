package com.pinheiro.evento.entities;

import com.pinheiro.evento.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

<<<<<<< HEAD
import java.util.UUID;

@Entity(name = "events")
=======
@Entity(name="events")
>>>>>>> fa5548957222fd23503ab0c94e10434153d37672
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

<<<<<<< HEAD
    public Event(EventRequestDTO eventRequest){
        this.date = eventRequest.date();
        this.maxParticipants = eventRequest.maxParticipants();
        this.registeredParticipants = eventRequest.registeredParticipants();
        this.title = eventRequest.title();
        this.description = eventRequest.description();
    }
}
=======
    public Event(EventRequestDTO eventRequestDTO) {
        this.maxParticipants = eventRequestDTO.maxParticipants();
        this.registeredParticipants = eventRequestDTO.registeredParticipants();
        this.date = eventRequestDTO.date();
        this.title = eventRequestDTO.title();
        this.description = eventRequestDTO.description();
    }
}

>>>>>>> fa5548957222fd23503ab0c94e10434153d37672
