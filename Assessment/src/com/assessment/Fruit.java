package com.assessment;

public class Fruit {
	private String name;
	private Integer calories;
	private Integer price;
	private String color;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Fruit(String name, String color, Integer calories, Integer price) {
		super();
		this.name = name;
		this.calories = calories;
		this.price = price;
		this.color = color;
	}
	public Fruit() {
		super();
	}
	@Override
	public String toString() {
		return "Fruit [name=" + name + ", calories=" + calories + ", price=" + price + ", color=" + color + "]";
	}
	
	public int compareByCal(Fruit f1,Fruit f2) {
		return f1.getCalories().compareTo(f2.getCalories());
	}
	public int compareByPrice(Fruit f1,Fruit f2) {
		return f1.getPrice().compareTo(f2.getPrice());
	}
}
