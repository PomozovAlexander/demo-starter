package com.aston.custom_spring_boot_example.starter_demo.config;

import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
@ConditionalOnClass
@EnableConfigurationProperties
public class LoggerAutoConfiguration {


    @Bean

    public Logger myLogger(){
        return (Logger) LoggerFactory.getLogger("MyCustomLogger");
    }
}
