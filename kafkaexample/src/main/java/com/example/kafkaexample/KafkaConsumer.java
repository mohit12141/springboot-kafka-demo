package com.example.kafkaexample;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    @KafkaListener(topics = "test-topic", groupId = "demo-group")
    public void listen(String message) {
        System.out.println("Received Message: " + message);
    }
}
