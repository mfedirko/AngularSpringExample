package com.nothing.demo.security.cors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsConfig  {

    @Bean
    public WebMvcConfigurer webMvcConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings (CorsRegistry registry){
                registry.addMapping("/**")
                    .allowedOrigins("*")
                    .allowedHeaders("x-auth-token", "x-requested-with", "x-xsrf-token");
            }
        };

    }
}
