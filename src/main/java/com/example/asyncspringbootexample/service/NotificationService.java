package com.example.asyncspringbootexample.service;

import java.util.concurrent.TimeUnit;
import lombok.extern.log4j.Log4j2;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Log4j2
@Service
public class NotificationService {

  @Async("asyncExecutor")
  public void msgAsync() {
    log.info("thread:"+Thread.currentThread().getName());
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public void msgSync() {
    log.info("thread:"+Thread.currentThread().getName());
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  @Async
  public void msgAsyncEx() {
    log.info("thread:"+Thread.currentThread().getName());
    int a = 2/0;
    try {
      TimeUnit.SECONDS.sleep(3);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
