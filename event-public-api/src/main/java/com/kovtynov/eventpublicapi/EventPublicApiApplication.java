package com.kovtynov.eventpublicapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventPublicApiApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(EventPublicApiApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting EventPublicApiApplication");
        SpringApplication.run(EventPublicApiApplication.class, args);
    }

}
