package com.aston.custom_spring_boot_example.starter_demo.service;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@ConditionalOnClass
@EnableConfigurationProperties
public class LoggerAutoConfiguration {


    @Bean
    @ConditionalOnMissingBean
    public Logger myLogger(LoggerProperties properties){
        return new Logger (properties.getName(), properties.isDebug());
    }
}
