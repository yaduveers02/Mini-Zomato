package com.example.zomato.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ResturantFoodMapping {

	@Id
	private int id;
	private int price;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "restaurant_id")
	private Restaurant restaurant;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fooditem_id")
	private FoodItem foodItem;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public FoodItem getFoodItem() {
		return foodItem;
	}

	public void setFoodItem(FoodItem foodItem) {
		this.foodItem = foodItem;
	}

	public ResturantFoodMapping(int price, Restaurant restaurant, FoodItem foodItem) {
		super();
		this.price = price;
		this.restaurant = restaurant;
		this.foodItem = foodItem;
	}

	public ResturantFoodMapping() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
