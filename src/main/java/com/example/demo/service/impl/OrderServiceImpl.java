package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.OrderMapper;
import com.example.demo.repository.OrderRepository;
import com.example.demo.service.OrderService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;
	
	@Override
	public OrderDto createOrder(OrderDto orderDto) {
		// TODO Auto-generated method stub
		
		Order order = OrderMapper.mapToOrder(orderDto);
		Order savedOrder = orderRepository.save(order);
		
		return OrderMapper.mapToOrderDto(savedOrder);
	}

	@Override
	public OrderDto getOrderById(Long orderId) {
		// TODO Auto-generated method stub
		Order order = orderRepository.findById(orderId)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Order is not exists with given id:" + orderId));
		
		return OrderMapper.mapToOrderDto(order);
	}

	@Override
	public List<OrderDto> getAllOrders() {
		// TODO Auto-generated method stub
		List<Order> orders = orderRepository.findAll();
		return orders.stream().map((order) -> OrderMapper.mapToOrderDto(order)).collect(Collectors.toList());
	}

	@Override
	public OrderDto updateOrder(Long orderId, OrderDto updatedOrder) {
		// TODO Auto-generated method stub
		Order order = orderRepository.findById(orderId).orElseThrow(
				() -> new ResourceNotFoundException("Order is not exists with given id:" + orderId));
		
		order.setAddress(updatedOrder.getAddress());
		order.setOrder_status(updatedOrder.getOrder_status());
		order.setPayment_type(updatedOrder.getPayment_type());
		order.setPhone_number(updatedOrder.getPhone_number());
		order.setProduct_id(updatedOrder.getProduct_id());
		order.setUser_name(updatedOrder.getUser_name());
		
		Order updatedOrderObj = orderRepository.save(order);
		
		return OrderMapper.mapToOrderDto(updatedOrderObj);
	}

	@Override
	public void deleteOrder(Long orderId) {
		// TODO Auto-generated method stub
		Order order = orderRepository.findById(orderId).orElseThrow(
				() -> new ResourceNotFoundException("Order is not exists with given id:" + orderId));
		
		orderRepository.deleteById(orderId);
		
	}

}
