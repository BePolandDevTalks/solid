//package com.betse.devtalks.solid.springconfig;
//
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;
//
//@EnableWebSecurity
//@ComponentScan(basePackages = {"com.example.security"})
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        // Authenticated paths
//
//        http.addFilterBefore(new TokenAuthenticationFilter(tokenService, authenticationEntryPoint),
//                BasicAuthenticationFilter.class);
//    }
//}
