package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ProductDto;
import com.example.demo.entity.Product;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	@Override
	public ProductDto createProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		Product product = ProductMapper.mapToProduct(productDto);
		Product savedProduct = productRepository.save(product);
		
		return ProductMapper.mapToProductDto(savedProduct);
	}

	@Override
	public ProductDto getProductById(Long productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> 
				new ResourceNotFoundException("Product is not exists with given id:" + productId));
		
		return ProductMapper.mapToProductDto(product);
	}

	@Override
	public List<ProductDto> getAllProducts() {
		// TODO Auto-generated method stub
		List<Product> products = productRepository.findAll();
		return products.stream().map((product) -> ProductMapper.mapToProductDto(product)).collect(Collectors.toList());
	}

	@Override
	public ProductDto updateProduct(Long productId, ProductDto updatedProduct) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).orElseThrow(
				() -> new ResourceNotFoundException("Product is not exists with given id:" + productId));
		
		product.setProduct_Id(updatedProduct.getProduct_Id());
		product.setProduct_Name(updatedProduct.getProduct_Name());
		product.setCategory(updatedProduct.getCategory());
		product.setProduct_Details(updatedProduct.getProduct_Details());
		product.setBrand_Name(updatedProduct.getBrand_Name());
		product.setQuantity(updatedProduct.getQuantity());
		product.setPrice(updatedProduct.getPrice());
		product.setRating(updatedProduct.getRating());
		
		Product updatedProductObj = productRepository.save(product);
		
		return ProductMapper.mapToProductDto(updatedProductObj);
	}

	@Override
	public void deleteProduct(Long productId) {
		// TODO Auto-generated method stub
		Product product = productRepository.findById(productId).orElseThrow(
				() -> new ResourceNotFoundException("Product is not exists with given id:" + productId));
		
		productRepository.deleteById(productId);
	}

}
