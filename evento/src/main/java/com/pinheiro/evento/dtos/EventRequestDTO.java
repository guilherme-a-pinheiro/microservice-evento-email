package com.pinheiro.evento.dtos;

public record EventRequestDTO(
        String id,
        int maxParticipants,
        int registeredParticipants,
        String date,
        String title,
        String description
) {
}
