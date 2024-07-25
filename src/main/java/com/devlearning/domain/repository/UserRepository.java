package com.devlearning.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devlearning.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
