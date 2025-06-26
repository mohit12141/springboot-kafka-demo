package com.example.kafkaexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/kafka")
public class KafkaController {
    @Autowired
    private KafkaProducer producer;

    @PostMapping("/publish")
    public ResponseEntity<String> publish(@RequestBody String message) {
        producer.sendMessage(message);
        return ResponseEntity.ok("Message sent to Kafka topic");
    }
}

