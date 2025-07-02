package com.kovtynov.eventconsumer.repository;

import com.kovtynov.eventconsumer.model.EventEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<EventEntity, String> {
}
