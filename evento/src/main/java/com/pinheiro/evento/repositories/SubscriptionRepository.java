package com.pinheiro.evento.repositories;

import com.pinheiro.evento.entities.Subscription;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubscriptionRepository extends JpaRepository<Subscription, Long> {

}
