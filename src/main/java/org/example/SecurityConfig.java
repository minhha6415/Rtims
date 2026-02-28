package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/**").permitAll()       // API JSON cho phép tất cả
                        .requestMatchers("/items/**").permitAll()     // Trang web Thymeleaf cho phép
                        .anyRequest().authenticated()                 // Các đường dẫn khác cần login
                )
                .csrf(csrf -> csrf.disable())  // Tạm tắt CSRF để test form POST dễ dàng
                .formLogin(form -> form.disable());

        return http.build();
    }
}