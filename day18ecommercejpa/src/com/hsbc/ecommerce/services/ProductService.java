package com.hsbc.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hsbc.ecommerce.models.Product;
import com.hsbc.ecommerce.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	//insert operation
	
	public Product insertProduct(Product product)
	{
		return repository.save(product);
	}
	
	//select all
	public List<Product> selectAllProduct()
	{
		return repository.findAll();
	}
	
	//select with where condition
	public Product getProductById(Long Id)
	{
		return repository.findById(Id).orElse(null);
	}
	
	
	//delete with ID
	
	public void deleteProductById(Long Id)
	{
		repository.deleteById(Id);
		
	}
	
	

}
