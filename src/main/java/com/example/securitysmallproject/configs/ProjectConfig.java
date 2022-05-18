//package com.example.securitysmallproject.configs;
//
//import com.example.securitysmallproject.securityService.JpaUserDetailsService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
//
//@Configuration
//public class ProjectConfig {
//
//
//    @Bean
//    public BCryptPasswordEncoder bCryptPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public SCryptPasswordEncoder sCryptPasswordEncoder() {
//        return new SCryptPasswordEncoder();
//    }
//
//
//    @Bean
//    UserDetailsService userDetailsService(){
//        return new JpaUserDetailsService();
//    }
//
//}
