package com.example.Kafka.controller;

import com.example.Kafka.service.Consumer;
import com.example.Kafka.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/kafka")
public class KafkaController {
    @Autowired
    private final Producer producer;

    private String message;

    KafkaController(Producer producer, Consumer consumer){
        this.producer = producer;
    }
    @PostMapping(value="/publish")
    public void sendMessageToKafkaTopic(@RequestParam("message") String message){
        this.producer.sendMessage(message);
    }

}
