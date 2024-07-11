package com.example.demo.mapper;

import com.example.demo.dto.AdminDto;
import com.example.demo.entity.Admin;

public class AdminMapper {
	
	public static AdminDto mapToAdminDto(Admin admin) {
		return new AdminDto(
				admin.getId(),
				admin.getUser_Name(),
				admin.getPassword()
		);
	}
	
	
	public static Admin mapToAdmin(AdminDto adminDto) {
		return new Admin(
				adminDto.getId(),
				adminDto.getUser_Name(),
				adminDto.getPassword()
		);
	}

}
