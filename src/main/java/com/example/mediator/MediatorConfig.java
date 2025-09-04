package com.example.mediator;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MediatorConfig {
 @Bean
    public Mediator mediator(List<IHandler<?, ?>> handlers) {
        Mediator mediator = new Mediator();
        for (IHandler<?, ?> handler : handlers) {
          mediator.registerHandler((Class) handler.getRequestType(), handler);
        }
        return mediator;
    }
}
