package net.nishant.springboot_kafka_demo.controller;

import net.nishant.springboot_kafka_demo.kafka.JsonKafkaProducer;
import net.nishant.springboot_kafka_demo.payload.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v2/kafka")
public class JsonMessageController {

    @Autowired
   private JsonKafkaProducer jsonKafkaProducer;

    @PostMapping("/publishJsonData")
    public ResponseEntity<String> publish(@RequestBody User user) {
        jsonKafkaProducer.sendMessage(user);
        return ResponseEntity.ok("Json Message sent to kafka topic " + user.toString());
    }



}
