package com.kovtynov.eventconsumer.listener;


import com.kovtynov.avro.Event;
import com.kovtynov.eventconsumer.model.EventEntity;
import com.kovtynov.eventconsumer.repository.EventRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class EventListener {

    private final EventRepository repository;
    private static final Logger log = LoggerFactory.getLogger(EventListener.class);

    public EventListener(EventRepository repository) {
        this.repository = repository;
    }


    @KafkaListener(topics = "events", groupId = "event-group")
    public void listen(Event event) {
        log.info("Received event {}", event);
        EventEntity entity = new EventEntity();
        entity.setUid(event.getUid());
        entity.setSubject(event.getSubject());
        entity.setDescription(event.getDescription());
        repository.save(entity);
        System.out.println("Saved: " + entity);
    }
}
