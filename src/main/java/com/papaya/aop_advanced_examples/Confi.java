package com.papaya.aop_advanced_examples;

import com.papaya.aop_advanced_examples.business.services.PapayaService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.scheduling.annotation.EnableAsync;

import javax.sql.DataSource;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@EnableAsync
public class Confi {


    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource) {
        return new JdbcTemplate(dataSource);
    }


    @Bean(name = "myEXS")
    public ExecutorService executorService(){
        return Executors.newFixedThreadPool(3);
    }


    public static void main(String[] args) {
        System.setProperty("java.awt.headless", "false");
        ConfigurableApplicationContext context = SpringApplication.run(Confi.class);

        PapayaService papayaService = context.getBean(PapayaService.class);
        try {
            papayaService.work();
        } catch (Exception e) {
            System.out.println("some problem with DB, come back later");
        }
    }
}
