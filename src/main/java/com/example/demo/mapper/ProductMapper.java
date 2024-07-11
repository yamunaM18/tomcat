package com.example.demo.mapper;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;

public class ProductMapper {
	
	public static ProductDto mapToProductDto(Product product) {
		return new ProductDto(
				product.getId(),
				product.getProduct_Id(),
				product.getProduct_Name(),
				product.getCategory(),
				product.getProduct_Details(),
				product.getBrand_Name(),
				product.getQuantity(),
				product.getPrice(),
				product.getRating()
		);
	}
	
	public static Product mapToProduct(ProductDto productDto) {
		return new Product(
				productDto.getId(),
				productDto.getProduct_Id(),
				productDto.getProduct_Name(),
				productDto.getCategory(),
				productDto.getProduct_Details(),
				productDto.getBrand_Name(),
				productDto.getQuantity(),
				productDto.getPrice(),
				productDto.getRating()
		);
	}

}
