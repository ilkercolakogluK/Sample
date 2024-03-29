package com.kafein.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
public class KafeinSampleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(KafeinSampleApplication.class, args);
    }
}
