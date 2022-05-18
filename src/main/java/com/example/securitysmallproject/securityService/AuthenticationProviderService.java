//package com.example.securitysmallproject.securityService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.crypto.scrypt.SCryptPasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//public class AuthenticationProviderService implements AuthenticationProvider {
//
//    @Autowired
//    JpaUserDetailsService jpaUserDetailsService;
//
//    @Autowired
//    BCryptPasswordEncoder bCryptPasswordEncoder;
//
//    @Autowired
//    SCryptPasswordEncoder sCryptPasswordEncoder;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//        String username = authentication.getName();
//        String password = authentication.getCredentials().toString();
//
//        User user = (User) jpaUserDetailsService.loadUserByUsername(username);
//
//        return checkPassword(user,password,bCryptPasswordEncoder);
//    }
//
//
//    private Authentication checkPassword(User user, String password, PasswordEncoder passwordEncoder){
//        String encoded = passwordEncoder.encode(password);
//        System.out.println(encoded);
//        if(passwordEncoder.matches(encoded,user.getPassword())){
//            return new UsernamePasswordAuthenticationToken(user.getUsername(),
//                    user.getPassword(),user.getAuthorities());
//        }else{
//            throw new BadCredentialsException("Invalid credentials");
//        }
//
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication);
//    }
//}
