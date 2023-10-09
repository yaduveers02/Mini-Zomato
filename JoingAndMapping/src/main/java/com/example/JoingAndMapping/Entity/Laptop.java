package com.example.JoingAndMapping.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	private String modelnumber;
	private String brand;

	
}

