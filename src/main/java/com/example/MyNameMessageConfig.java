package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

@Configuration
@Import(RandomTextMessageConfig.class)
public class MyNameMessageConfig {
    @Bean
    @Scope("prototype")
    public MessageService myNameMessage() {
        return new MyNameMessageService();
    }
}
