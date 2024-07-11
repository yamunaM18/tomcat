package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.ProductDto;

public interface ProductService {
    
	ProductDto createProduct(ProductDto adminDto);
	
	ProductDto getProductById(Long adminId);
	
	List<ProductDto> getAllProducts();
	
	ProductDto updateProduct(Long adminId, ProductDto updatedProduct);
	
	void deleteProduct(Long adminId);
}
