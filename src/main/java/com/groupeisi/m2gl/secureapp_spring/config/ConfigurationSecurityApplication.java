package com.groupeisi.m2gl.secureapp_spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.servlet.util.matcher.MvcRequestMatcher;
import org.springframework.web.servlet.handler.HandlerMappingIntrospector;

  @Configuration
  @EnableWebSecurity
  public class ConfigurationSecurityApplication {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http, MvcRequestMatcher.Builder mvc) throws Exception {
      return http
              .csrf(AbstractHttpConfigurer::disable)
              .authorizeHttpRequests(authorize -> authorize
                      .requestMatchers(mvc.pattern("/api/**")).permitAll()
                      .anyRequest().authenticated()
              ).build();
    }
    @Bean
    MvcRequestMatcher.Builder mvc(HandlerMappingIntrospector introspector) {
      return new MvcRequestMatcher.Builder(introspector);
    }
  }

