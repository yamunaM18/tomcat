package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.UserMapper;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDto createUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = UserMapper.mapToUser(userDto);
		User savedUser = userRepository.save(user);
		
		return UserMapper.mapToUserDto(savedUser);
	}

	@Override
	public UserDto getUserById(Long userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId)
				.orElseThrow(() -> 
				new ResourceNotFoundException("User is not exists with given id:" + userId));
		
		return UserMapper.mapToUserDto(user);
	}

	@Override
	public List<UserDto> getAllUsers() {
		// TODO Auto-generated method stub
		List<User> users = userRepository.findAll();
		return users.stream().map((user) -> UserMapper.mapToUserDto(user)).collect(Collectors.toList());
	}

	@Override
	public UserDto updateUser(Long userId, UserDto updatedUser) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User is not exists with given id:" + userId));
		
		user.setName(updatedUser.getName());
		user.setPassword(updatedUser.getPassword());
		user.setEmail(updatedUser.getEmail());
		user.setAccess(updatedUser.getAccess());
		user.setAddress(updatedUser.getAddress());
		user.setPhone_Number(updatedUser.getPhone_Number());
		user.setUser_Name(updatedUser.getUser_Name());
		user.setUser_Type(updatedUser.getUser_Type());
		
		User updatedUserObj = userRepository.save(user);
		
		return UserMapper.mapToUserDto(updatedUserObj);
	}

	@Override
	public void deleteUser(Long userId) {
		// TODO Auto-generated method stub
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User is not exists with given id:" + userId));
		
		userRepository.deleteById(userId);
	}

}
