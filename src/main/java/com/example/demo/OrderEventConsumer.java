package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class OrderEventConsumer {

    @KafkaListener(topics = {"test-topic"})
    public void onMessage(ConsumerRecord<Integer,String> consumerRecord){

        log.info("Consumer records : {}", consumerRecord);

    }
}
