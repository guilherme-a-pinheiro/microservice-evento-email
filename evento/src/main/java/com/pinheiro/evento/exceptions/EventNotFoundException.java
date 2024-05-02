package com.pinheiro.evento.exceptions;

public class EventNotFoundException extends RuntimeException{
    public EventNotFoundException(){
        super("Not found event");
    }
}
