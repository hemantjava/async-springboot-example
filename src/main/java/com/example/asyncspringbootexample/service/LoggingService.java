package com.example.asyncspringbootexample.service;

import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class LoggingService {

    @Async
    public void logMessage(String message) {
        log.info("thread:"+Thread.currentThread().getName());
        log.info(message);
    }
}

