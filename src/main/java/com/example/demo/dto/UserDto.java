package com.example.demo.dto;

public class UserDto {
	
	private Long id;
	private String user_Name;
	private String phone_Number;
	private String address;
	private String user_Type;
	private String access;
	private String name;
	private String password;
	private String email;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUser_Name() {
		return user_Name;
	}
	public void setUser_Name(String user_Name) {
		this.user_Name = user_Name;
	}
	public String getPhone_Number() {
		return phone_Number;
	}
	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getUser_Type() {
		return user_Type;
	}
	public void setUser_Type(String user_Type) {
		this.user_Type = user_Type;
	}
	public String getAccess() {
		return access;
	}
	public void setAccess(String access) {
		this.access = access;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public UserDto(Long id, String user_Name, String phone_Number, String address, String user_Type, String access,
			String name, String password, String email) {
		super();
		this.id = id;
		this.user_Name = user_Name;
		this.phone_Number = phone_Number;
		this.address = address;
		this.user_Type = user_Type;
		this.access = access;
		this.name = name;
		this.password = password;
		this.email = email;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
