package com.example.zomato.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartFoodMapping {

	@Id
	private int id;
	
	private int quentity;
	private int cart_id;
//	private int food_id
	
	private int resturantFoodMapping_id;
}
