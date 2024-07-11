package com.example.demo.mapper;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

public class UserMapper {
	
	public static UserDto mapToUserDto(User user) {
		return new UserDto(
				user.getId(),
				user.getUser_Name(),
				user.getPhone_Number(),
				user.getAddress(),
				user.getUser_Type(),
				user.getAccess(),
				user.getName(),
				user.getPassword(),
				user.getEmail()
		);
	}
	
	public static User mapToUser(UserDto userDto) {
		return new User(
				userDto.getId(),
				userDto.getUser_Name(),
				userDto.getPhone_Number(),
				userDto.getAddress(),
				userDto.getUser_Type(),
				userDto.getAccess(),
				userDto.getName(),
				userDto.getPassword(),
				userDto.getEmail()
		);
	}
}
