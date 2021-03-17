package com.papaya.hiebernate.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * @author Evgeny Borisov
 */
@SpringBootApplication
public class MainApp {

    @Bean
    public Integer integer() {
        return 666;
    }




    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(MainApp.class);
        System.out.println("integer = " + context.getBean(Integer.class));
        System.out.println("integer = " + context.getBean(Integer.class));
        System.out.println("integer = " + context.getBean(Integer.class));
    }
}
