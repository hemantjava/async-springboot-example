package com.example.asyncspringbootexample.controller;

import com.example.asyncspringbootexample.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Controller {

  private final NotificationService notificationService;

  public Controller(NotificationService notificationService) {
    this.notificationService = notificationService;
  }

  //localhost:9192/api/msgAsync
  @GetMapping("/msgAsync")
  public ResponseEntity<String> getMessageAsync() {
    notificationService.msgAsync();
    return ResponseEntity.ok("thread:" + Thread.currentThread().getName());
  }

  //localhost:9192/api/msgSync
  @GetMapping("/msgSync")
  public ResponseEntity<String> getMessageSync() {
    notificationService.msgSync();
    return ResponseEntity.ok("thread:" + Thread.currentThread().getName());
  }

  //localhost:9192/api/msgAsyncEx
  @GetMapping("/msgAsyncEx")
  public ResponseEntity<String> getMessageException() {
    notificationService.msgAsyncEx();
    return ResponseEntity.ok("thread:" + Thread.currentThread().getName());
  }

}
