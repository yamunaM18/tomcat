package com.example.demo.dto;

public class AdminDto {
	
    private Long id;
	private String user_Name;
	private String password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AdminDto(Long id, String user_Name, String password) {
		super();
		this.id = id;
		this.user_Name = user_Name;
		this.password = password;
	}
	public AdminDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
