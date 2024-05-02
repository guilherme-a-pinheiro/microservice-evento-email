package com.pinheiro.evento.exceptions;

public class EventFullException extends RuntimeException{
    public EventFullException(){
        super("The event is full");
    }
}
