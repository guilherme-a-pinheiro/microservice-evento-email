package com.pinheiro.evento.repositories;

import com.pinheiro.evento.entities.Event;
import feign.Param;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, String>{

    @Query(value = "SELECT * FROM events e WHERE PARSE(e.date AS TIMESTAMP) > :currentDate", nativeQuery = true)
    List<Event> findUpcomingEvent(@Param("currentDate") LocalDateTime currentDate);

    @NonNull
    Optional<Event> findById(@NonNull String id);
}
