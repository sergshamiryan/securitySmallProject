///*
//package com.example.securitysmallproject.securityService;
//
//import com.example.securitysmallproject.model.User;
//import com.example.securitysmallproject.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.stream.Collectors;
//
//@Service
//public class JpaUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException("Problem during authentication!"));
//
//
//        UserDetails userDetails =
//                org.springframework.security.core.userdetails.User.withUsername(user.getUsername())
//                        .password(user.getPassword())
//                        .authorities(user.getAuthorities().stream().map((a) -> new SimpleGrantedAuthority(a.getName())).collect(Collectors.toSet()))
//                        .build();
//
//
//        return userDetails;
//    }
//
//}
//*/
