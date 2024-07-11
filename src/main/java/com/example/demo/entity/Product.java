package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String product_Id;
	private String product_Name;
	private String category;
	private String product_Details;
	private String brand_Name;
	private String quantity;
	private String price;
	private String rating;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(String product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProduct_Details() {
		return product_Details;
	}
	public void setProduct_Details(String product_Details) {
		this.product_Details = product_Details;
	}
	public String getBrand_Name() {
		return brand_Name;
	}
	public void setBrand_Name(String brand_Name) {
		this.brand_Name = brand_Name;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Product(Long id, String product_Id, String product_Name, String category, String product_Details,
			String brand_Name, String quantity, String price, String rating) {
		super();
		this.id = id;
		this.product_Id = product_Id;
		this.product_Name = product_Name;
		this.category = category;
		this.product_Details = product_Details;
		this.brand_Name = brand_Name;
		this.quantity = quantity;
		this.price = price;
		this.rating = rating;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
