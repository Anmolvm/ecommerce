package com.hsbc.ecommerce.models;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="PRODUCT")
public class Product {
   
	@Id //primary key
	//@GeneratedValue(strategy=GenerationType.IDENTITY) auto generation
	@Column(name="PRODUCT_ID")
	private long productId;
	@Column(name="NAME",nullable=false,length=50)
	private String name;
	@DateTimeFormat(iso=DateTimeFormat.ISO.DATE)
	@Column(name="DOP",nullable=false)
	private LocalDate dop;
	@Column(name="COST")
	private double cost;
	@Column(name="IN_STOCK")
	private long inStock;
	public long getProductId() {
		return productId;
	}
	public void setProductId(long productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDop() {
		return dop;
	}
	public void setDop(LocalDate dop) {
		this.dop = dop;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public long getInStock() {
		return inStock;
	}
	public void setInStock(long inStock) {
		this.inStock = inStock;
	}
	
	
	
}
