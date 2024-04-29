package com.pinheiro.evento.entities;

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
}
