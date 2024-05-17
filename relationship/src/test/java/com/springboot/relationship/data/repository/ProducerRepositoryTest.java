package com.springboot.relationship.data.repository;

import javax.transaction.Transactional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.google.common.collect.Lists;
import com.springboot.relationship.data.entity.Producer;
import com.springboot.relationship.data.entity.Product;

public class ProducerRepositoryTest {
	@Autowired
	ProducerRepository producerRepository;
	
	@Autowired
	ProductRepository productRepository;
	/*
	@Test
	@Transactional
	void relationshipTest() {
		Product product1 = saveProduct("동글펜" , 500, 1000);
		Product product2 = saveProduct("네모 공책" , 100, 2000);
		Product product3 = saveProduct("지우개" , 152, 1234);
		
		Producer producer1 = saveProducer("flature");
		Producer producer2 = saveProducer("wikibooks");
		
		producer1.addProduct(product1);
		producer1.addProduct(product2);
		
		producer2.addProduct(product2);
		producer2.addProduct(product3);
		
		producerRepository.saveAll(Lists.newArrayList(producer1, producer2));
		
		System.out.println(producerRepository.findById(1L).get().getProducts());
		
		
	}
	
	private Product saveProduct(String name, Integer price, Integer stock) {
		Product product = new Product();
		product.setName(name);
		product.setPrice(price);
		product.setStock(stock);
		
		return productRepository.save(product);
	}
	*/
	
}
