package com.auth0.authapi.bootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth0.authapi.bootapp.entity.ApplicationUser;


public interface ApplicationUserRepository  extends JpaRepository<ApplicationUser, Long>{
	ApplicationUser findByUsername(String username);
}
