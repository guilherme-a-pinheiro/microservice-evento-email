package com.pinheiro.evento.repositories;

import com.pinheiro.evento.entities.Event;
import feign.Param;
import jakarta.annotation.Nonnull;
import lombok.NonNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface EventRepository extends JpaRepository<Event, String> {

<<<<<<< HEAD
    @Query(value = "SELECT * FROM event e WHERE parsedatetime(e.date, 'dd/MM/yyyy') > :currentDate", nativeQuery = true)
    List<Event> findUpcomingEvents(@Param("currentDate") LocalDateTime currentDate);
=======
    @Query(value = "SELECT * FROM events e WHERE parsedatetime(e.date, 'dd/MM/yyyy') >= :currentDate", nativeQuery = true)
    List<Event> findUpcomingEvent(@Param("currentDate") LocalDateTime currentDate);
>>>>>>> fa5548957222fd23503ab0c94e10434153d37672

    @Nonnull
    Optional<Event> findById(@Nonnull String id);
}
