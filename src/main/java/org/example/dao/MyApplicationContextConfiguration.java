package org.example.dao;

import org.example.util.DB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class MyApplicationContextConfiguration {
    @Bean
    public DB dataBase() {
        return new DB();
    }

}
