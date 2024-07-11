package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.AdminDto;
import com.example.demo.dto.OrderDto;
import com.example.demo.dto.ProductDto;
import com.example.demo.dto.UserDto;
import com.example.demo.service.AdminService;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;
import com.example.demo.service.UserService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private AdminService adminService;
	
	@Autowired
	private ProductService productService;
	
	@PostMapping("/orders")
	public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto){
		OrderDto savedOrder = orderService.createOrder(orderDto);
		return new ResponseEntity<>(savedOrder, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/orders/{id}")
	public ResponseEntity<OrderDto> getOrderById(@PathVariable("id") Long orderId){
		OrderDto orderDto = orderService.getOrderById(orderId);
		return ResponseEntity.ok(orderDto);
	}
	
	@GetMapping("/orders")
	public ResponseEntity<List<OrderDto>> getAllOrders(){
		List<OrderDto> orders = orderService.getAllOrders();
		return ResponseEntity.ok(orders);
	}
	
	@PutMapping("/orders/{id}")
	public ResponseEntity<OrderDto> updateOrder(@PathVariable("id") Long orderId, @RequestBody OrderDto updatedOrder){
		OrderDto orderDto = orderService.updateOrder(orderId, updatedOrder);
		return ResponseEntity.ok(orderDto);
	}
	
	@DeleteMapping("/orders/{id}")
	public ResponseEntity<String> deleteOrder(@PathVariable("id") Long orderId){
		orderService.deleteOrder(orderId);
		return ResponseEntity.ok("Order deleted successfully!.");
	}
	
	
	@PostMapping("/users")
	public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
		UserDto savedUser = userService.createUser(userDto);
		return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/users/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable("id") Long userId){
		UserDto userDto = userService.getUserById(userId);
		return ResponseEntity.ok(userDto);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		List<UserDto> users = userService.getAllUsers();
		return ResponseEntity.ok(users);
	}
	
	@PutMapping("/users/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable("id") Long userId, @RequestBody UserDto updatedUser){
		UserDto userDto = userService.updateUser(userId, updatedUser);
		return ResponseEntity.ok(userDto);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<String> deleteUser(@PathVariable("id") Long userId){
		userService.deleteUser(userId);
		return ResponseEntity.ok("User deleted successfully!.");
	}
	
	@PostMapping("/admin")
	public ResponseEntity<AdminDto> createAdmin(@RequestBody AdminDto adminDto){
		AdminDto savedAdmin = adminService.createAdmin(adminDto);
		return new ResponseEntity<>(savedAdmin, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/admin/{id}")
	public ResponseEntity<AdminDto> getAdminById(@PathVariable("id") Long adminId){
		AdminDto adminDto = adminService.getAdminById(adminId);
		return ResponseEntity.ok(adminDto);
	}
	
	@GetMapping("/admin")
	public ResponseEntity<List<AdminDto>> getAllAdmins(){
		List<AdminDto> admins = adminService.getAllAdmins();
		return ResponseEntity.ok(admins);
	}
	
	@PutMapping("/admin/{id}")
	public ResponseEntity<AdminDto> updateAdmin(@PathVariable("id") Long adminId, @RequestBody AdminDto updatedAdmin){
		AdminDto adminDto = adminService.updateAdmin(adminId, updatedAdmin);
		return ResponseEntity.ok(adminDto);
	}
	
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable("id") Long adminId){
		adminService.deleteAdmin(adminId);
		return ResponseEntity.ok("Admin deleted successfully!.");
	}
	
	@PostMapping("/products")
	public ResponseEntity<ProductDto> createProduct(@RequestBody ProductDto productDto){
		ProductDto savedProduct = productService.createProduct(productDto);
		return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/products/{id}")
	public ResponseEntity<ProductDto> getProductById(@PathVariable("id") Long productId){
		ProductDto productDto = productService.getProductById(productId);
		return ResponseEntity.ok(productDto);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<ProductDto>> getAllProducts(){
		List<ProductDto> products = productService.getAllProducts();
		return ResponseEntity.ok(products);
	}
	
	@PutMapping("/products/{id}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable("id") Long productId, @RequestBody ProductDto updatedProduct){
		ProductDto productDto = productService.updateProduct(productId, updatedProduct);
		return ResponseEntity.ok(productDto);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable("id") Long productId){
		productService.deleteProduct(productId);
		return ResponseEntity.ok("Product deleted successfully!.");
	}
}
