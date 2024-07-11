package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.AdminDto;

public interface AdminService {
	
    AdminDto createAdmin(AdminDto adminDto);
	
	AdminDto getAdminById(Long adminId);
	
	List<AdminDto> getAllAdmins();
	
	AdminDto updateAdmin(Long adminId, AdminDto updatedAdmin);
	
	void deleteAdmin(Long adminId);
}
