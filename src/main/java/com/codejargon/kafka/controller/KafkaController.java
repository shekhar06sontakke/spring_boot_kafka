package com.codejargon.kafka.controller;

import com.codejargon.kafka.component.MessageProducer;
import com.codejargon.kafka.constant.KafkaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
    @Autowired
    MessageProducer messageProducer;

    @PostMapping("/send")
    public String sendMessage() {
        messageProducer.sendMessage(KafkaConstants.TOPIC, "Hello Neelansh!");
        return "Message sent: ";
    }
}
