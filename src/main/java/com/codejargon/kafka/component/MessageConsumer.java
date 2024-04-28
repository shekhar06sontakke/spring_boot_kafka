package com.codejargon.kafka.component;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {
    @KafkaListener(topics = "kafka_demo", groupId = "test_group_id")
    public void listen(String message){
        System.out.println("Received message: "+ message);
    }
}
