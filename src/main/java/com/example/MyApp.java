package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext((MyNameMessageConfig.class));

        MessageService messageService = applicationContext.getBean(MyNameMessageService.class);
        MessageService messageService2 = applicationContext.getBean(RandomTextMessageService.class);


        System.out.println(messageService.getMessage());
        System.out.println(messageService2.getMessage());
        System.out.println("Hash messageService : " + messageService.hashCode());
        System.out.println("Hash messageService2 : " + messageService2.hashCode());
    }
}
