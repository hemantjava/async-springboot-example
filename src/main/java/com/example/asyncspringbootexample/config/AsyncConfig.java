package com.example.asyncspringbootexample.config;

import java.util.concurrent.Executor;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
public class AsyncConfig extends AsyncConfigurerSupport {

  @Autowired
  private AsyncExceptionHandler asyncExceptionHandler;

  @Override
  public Executor getAsyncExecutor() {
    ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
    taskExecutor.setMaxPoolSize(50);
    taskExecutor.setCorePoolSize(5);
    taskExecutor.setThreadNamePrefix("thread-Async-");
    taskExecutor.setQueueCapacity(5000);
    taskExecutor.initialize();
    return taskExecutor;
  }

  @Override
  public AsyncUncaughtExceptionHandler getAsyncUncaughtExceptionHandler() {
    return asyncExceptionHandler;
  }
}
