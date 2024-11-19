package com.example.budgetapp.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.HttpSecurityBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
                .formLogin(httpForm -> {
                    httpForm
                            .loginPage(loginPage:"/login").permitAll();
                })

                .authorizeHttpRequests(registry ->{
                    registry.requestMatchers(...patterns:"/req/signup").permitAll();
                    registry.anyRequest().authenticated();
                })

                .build();
    }

}
