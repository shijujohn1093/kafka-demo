package com.thengara.kafkademo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.thengara.kafkademo.model.User;
import com.thengara.kafkademo.service.ProducerService;

@RestController
@RequestMapping(value = "/user")
public class KafkaController {

  private final ProducerService producer;

  @Autowired
  KafkaController(ProducerService producer) {
    this.producer = producer;
  }

  @PostMapping(value = "/publish")
  public void sendMessageToKafkaTopic(@RequestParam("name") String name, @RequestParam("age") Integer age) {
    this.producer.sendMessage(new User(name, age).toString());
  }
}