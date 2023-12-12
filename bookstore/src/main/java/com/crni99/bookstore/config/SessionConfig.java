package com.crni99.bookstore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.annotation.SessionScope;

import javax.servlet.http.HttpSession;

@Configuration
public class SessionConfig {

    @Bean
    @SessionScope
    public HttpSession httpSession() {
        // Trả về bean HttpSession
        return (HttpSession) new org.apache.catalina.session.StandardSessionFacade(null); // Thay thế với logic tạo HttpSession thực tế của bạn
    }
}
