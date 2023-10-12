package com.example.zomato.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Role {
	
	private int id;
	private String name;
	
	@OneToMany(mappedBy = "role")
	private List<User> users;

}
