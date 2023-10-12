package com.example.zomato.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;

import com.example.zomato.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

}
