package com.example.JoingAndMapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Email {

	@Id
	private int id;
	private String emailaddress;
	
	@ManyToOne
	@JoinColumn(name = "userfuch_id")
	private User user;
	
}
