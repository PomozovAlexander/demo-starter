package com.aston.custom_spring_boot_example.starter_demo.config;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class LoggerAutoConfiguration {
    @Value("${logging.custom.level:INFO}")
    private String logLevel;


    @Bean
    public Logger logger(){
        Logger myLogger= (Logger) LoggerFactory.getLogger("MyCustomLogger");
        myLogger.setLevel(Level.toLevel(logLevel));
        return  myLogger;

    }
}
