package org.example.dao;

import org.example.util.DB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyApplicationContextConfiguration {
    @Bean
    public DB dataBase() {
        return new DB();
    }

    @Bean
    public UserDao userDao() {
        return new UserDao(dataBase());
    }
}
