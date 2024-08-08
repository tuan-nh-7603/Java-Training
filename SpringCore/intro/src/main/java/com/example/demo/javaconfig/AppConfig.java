package com.example.demo.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public DataSource dataSource(){
        return new DataSource();
    }

    @Bean
    public Service service(){
        return new Service(dataSource());
    }

}
