package com.pinheiro.evento.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "subscrioption")
@Table(name = "subscriptions")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Event event;
    private String participantEmail;
}
