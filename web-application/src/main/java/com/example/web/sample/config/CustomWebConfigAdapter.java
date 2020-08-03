package com.example.web.sample.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CustomWebConfigAdapter implements WebMvcConfigurer { 
    @Override
    public void addInterceptors(final org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
        registry.addInterceptor(new CustomHeaderInterceptorAdapter());
    }
}