package com.example.Kafka.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class Consumer {
    private static final Logger logger = LoggerFactory.getLogger(Consumer.class);

    @KafkaListener(topics = "users",groupId = "group_id")
    public void consume(String message) throws IOException {
        //System.out.println(String.format("#####----> CONSUMED MESSAGE ----> %S",message));
        logger.info(String.format("#####----> CONSUMED MESSAGE ----> %S",message));

    }
}
