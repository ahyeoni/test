package com.springboot.relationship.service.impl;

import org.springframework.stereotype.Service;

import com.springboot.relationship.data.dto.ProductDto;
import com.springboot.relationship.data.dto.ProductResponseDto;
import com.springboot.relationship.service.ProductService;

@Service("productService")
public class ProductServiceImpl implements ProductService {

	@Override
	public ProductResponseDto getProduct(Long number) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductResponseDto saveProduct(ProductDto productDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProductResponseDto changeProductName(Long number, String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteProduct(Long number) throws Exception {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
