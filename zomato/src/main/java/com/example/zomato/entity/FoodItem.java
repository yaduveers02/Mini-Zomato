package com.example.zomato.entity;

import java.math.BigDecimal;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class FoodItem {

	private int id;
	private String name;
	private String description;
	private BigDecimal price;
	
	@ManyToOne
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
}
