package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.AdminDto;
import com.example.demo.entity.Admin;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.AdminMapper;
import com.example.demo.repository.AdminRepository;
import com.example.demo.service.AdminService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	@Override
	public AdminDto createAdmin(AdminDto adminDto) {
		// TODO Auto-generated method stub
		
		Admin admin = AdminMapper.mapToAdmin(adminDto);
		Admin savedAdmin = adminRepository.save(admin);
		
		return AdminMapper.mapToAdminDto(savedAdmin);
	}

	@Override
	public AdminDto getAdminById(Long adminId) {
		// TODO Auto-generated method stub
		Admin admin = adminRepository.findById(adminId)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Admin is not exists with given id:" + adminId));
		
		return AdminMapper.mapToAdminDto(admin);
	}

	@Override
	public List<AdminDto> getAllAdmins() {
		// TODO Auto-generated method stub
		List<Admin> admins = adminRepository.findAll();
		return admins.stream().map((admin) -> AdminMapper.mapToAdminDto(admin)).collect(Collectors.toList());
	}

	@Override
	public AdminDto updateAdmin(Long adminId, AdminDto updatedAdmin) {
		// TODO Auto-generated method stub
		Admin admin = adminRepository.findById(adminId).orElseThrow(
				() -> new ResourceNotFoundException("Admin is not exists with given id:" + adminId));
		
		admin.setUser_Name(updatedAdmin.getUser_Name());
		admin.setPassword(updatedAdmin.getPassword());
		
		Admin updatedAdminObj = adminRepository.save(admin);
		
		return AdminMapper.mapToAdminDto(updatedAdminObj);
	}

	@Override
	public void deleteAdmin(Long adminId) {
		// TODO Auto-generated method stub
		Admin admin = adminRepository.findById(adminId).orElseThrow(
				() -> new ResourceNotFoundException("Admin is not exists with given id:" + adminId));
		
		adminRepository.deleteById(adminId);
		
	}

}
