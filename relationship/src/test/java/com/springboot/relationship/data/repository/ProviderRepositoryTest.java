package com.springboot.relationship.data.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.springboot.relationship.data.entity.Product;
import com.springboot.relationship.data.entity.Provider;

@SpringBootTest
public class ProviderRepositoryTest {
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	ProviderRepository providerRepository;
	
	/*
	@Test
	void relationshipTest1() {
		// 테스트 데이터 생성 
		Provider provider = new Provider();
		provider.setName("삼성물산");
		
		providerRepository.save(provider);
		
		Product product = new Product();
		product.setName("가위");
		product.setPrice(5000);
		product.setStock(500);
		product.setProvider(provider);
		
		productRepository.save(product);
		
		//테스트 
		System.out.println("product : " + productRepository.findById(1L).orElseThrow(RuntimeException::new));
		
		System.out.println("provider: " + productRepository.findById(1L).orElseThrow(RuntimeException::new).getProvider());
		
	}
	*/
	
	@Test 
	void relationshipTest() {
		Provider provider = new Provider();
		provider.setName("현대물산");
		
		providerRepository.save(provider);
		
		Product product1 = new Product();
		product1.setName("펜");
		product1.setPrice(2000);
		product1.setStock(100);
		product1.setProvider(provider);
		
		
		Product product2 = new Product();
		product2.setName("가방");
		product2.setPrice(20000);
		product2.setStock(200);
		product2.setProvider(provider);
		
		Product product3 = new Product();
		product3.setName("펜");
		product3.setPrice(3000);
		product3.setStock(1000);
		product3.setProvider(provider);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		
		List<Product> products = providerRepository.findById(provider.getId()).get().getProductList();
		
		for(Product product:products) {
			System.out.println(product);
		}
	}
	
	
	
}
