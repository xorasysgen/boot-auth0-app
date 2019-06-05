package com.auth0.authapi.bootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auth0.authapi.bootapp.entity.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}