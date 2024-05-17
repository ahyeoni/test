package com.springboot.relationship.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.relationship.data.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
