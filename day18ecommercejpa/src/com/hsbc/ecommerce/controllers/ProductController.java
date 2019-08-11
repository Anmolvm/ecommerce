package com.hsbc.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.hsbc.ecommerce.models.Product;
import com.hsbc.ecommerce.services.ProductService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@GetMapping("/")
	public ModelAndView home()
	{
		return new ModelAndView("addproduct","product",new Product());
	}
	
	@PostMapping("/addproduct")
	public String addProduct(@ModelAttribute("product") @Validated Product product,
			BindingResult bindigResult, Model model)
	{
		System.out.println(product.getName());
		//save the object
		Product object=productService.insertProduct(product);
		
		
		return "home";
	}
	
	@GetMapping("/getproducts")
	public ModelAndView getProducts()
	{
						
		return new ModelAndView("viewproduct","products", productService.selectAllProduct());
		
	}
	
	
	
}
