package com.spring.rest.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.spring.rest")
public class Config {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }


}
