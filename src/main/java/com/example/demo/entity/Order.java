package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private Long order_id;
	
	private String order_status;
	private String product_id;
	private String address;
	private String phone_number;
	private String payment_type;
	private String user_name;
	public Long getOrder_id() {
		return order_id;
	}
	public void setOrder_id(Long order_id) {
		this.order_id = order_id;
	}
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public String getProduct_id() {
		return product_id;
	}
	public void setProduct_id(String product_id) {
		this.product_id = product_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getPayment_type() {
		return payment_type;
	}
	public void setPayment_type(String payment_type) {
		this.payment_type = payment_type;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public Order(Long order_id, String order_status, String product_id, String address, String phone_number,
			String payment_type, String user_name) {
		super();
		this.order_id = order_id;
		this.order_status = order_status;
		this.product_id = product_id;
		this.address = address;
		this.phone_number = phone_number;
		this.payment_type = payment_type;
		this.user_name = user_name;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
