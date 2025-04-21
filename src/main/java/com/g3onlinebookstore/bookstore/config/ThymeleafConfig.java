package com.g3onlinebookstore.bookstore.config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.thymeleaf.extras.springsecurity6.dialect.SpringSecurityDialect;

@Configuration
public class ThymeleafConfig {

    @PostConstruct
    public void init() {
        System.out.println("🔧 ThymeleafConfig loaded — registering SpringSecurityDialect");
    }

    @Bean
    public SpringSecurityDialect springSecurityDialect() {
        return new SpringSecurityDialect();
    }
}
