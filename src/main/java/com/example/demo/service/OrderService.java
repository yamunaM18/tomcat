package com.example.demo.service;

import java.util.List;
import com.example.demo.dto.OrderDto;

public interface OrderService {
	OrderDto createOrder(OrderDto orderDto);
	
	OrderDto getOrderById(Long orderId);
	
	List<OrderDto> getAllOrders();
	
	OrderDto updateOrder(Long orderId, OrderDto updatedOrder);
	
	void deleteOrder(Long orderId);
}
