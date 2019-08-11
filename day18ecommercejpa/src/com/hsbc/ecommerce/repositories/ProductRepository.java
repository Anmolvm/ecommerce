package com.hsbc.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hsbc.ecommerce.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
