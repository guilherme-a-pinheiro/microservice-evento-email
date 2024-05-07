package com.pinheiro.evento.dtos;

import java.util.UUID;

public record EventRequestDTO(
        int maxParticipants,
        int registeredParticipants,
        String date,
        String title,
        String description
) {
}
