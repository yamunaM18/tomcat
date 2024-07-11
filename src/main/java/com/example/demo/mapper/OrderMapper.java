package com.example.demo.mapper;

import com.example.demo.dto.OrderDto;
import com.example.demo.entity.Order;

public class OrderMapper {
	
	public static OrderDto mapToOrderDto(Order order) {
		return new OrderDto(
				order.getOrder_id(),
				order.getOrder_status(),
				order.getProduct_id(),
				order.getAddress(),
				order.getPhone_number(),
				order.getPayment_type(),
				order.getUser_name()
		);
	}
	
	public static Order mapToOrder(OrderDto orderDto) {
		return new Order(
				orderDto.getOrder_id(),
				orderDto.getOrder_status(),
				orderDto.getProduct_id(),
				orderDto.getAddress(),
				orderDto.getPhone_number(),
				orderDto.getPayment_type(),
				orderDto.getUser_name()
				);
	}
}
