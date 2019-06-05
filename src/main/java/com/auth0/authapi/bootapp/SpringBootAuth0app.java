package com.auth0.authapi.bootapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class SpringBootAuth0app {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAuth0app.class, args);
	}
	
	 @Bean
	    public BCryptPasswordEncoder bCryptPasswordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
}
