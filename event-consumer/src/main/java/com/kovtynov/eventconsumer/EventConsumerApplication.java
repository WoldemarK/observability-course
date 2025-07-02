package com.kovtynov.eventconsumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EventConsumerApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(EventConsumerApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Starting EventConsumerApplication");
        SpringApplication.run(EventConsumerApplication.class, args);
    }

}
