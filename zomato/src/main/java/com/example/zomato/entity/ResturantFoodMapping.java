package com.example.zomato.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ResturantFoodMapping {

	@Id
	private int id;
	
	private int resturant_id;
	private int fooditem_id;
	
}
