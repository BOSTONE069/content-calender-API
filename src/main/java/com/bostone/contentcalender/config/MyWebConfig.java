package com.bostone.contentcalender.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.web.client.RestTemplateBuilder;

@Configuration
public class MyWebConfig {

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplateBuilder().build();
    }
}
