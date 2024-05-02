package com.pinheiro.evento.dtos;

public record EmailRequestDTO(
        String to,
        String subject,
        String body
) {
}
