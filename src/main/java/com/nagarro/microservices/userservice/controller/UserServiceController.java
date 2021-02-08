package com.nagarro.microservices.userservice.controller;


import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableList;
import com.nagarro.microservices.userservice.Configuration;
import com.nagarro.microservices.userservice.feign.Product;
import com.nagarro.microservices.userservice.feign.ProductServiceProxy;




@RestController
@RequestMapping("/api/user")
public class UserServiceController {

	
	@Autowired
	Configuration configuration;
	
	@Autowired
	ProductServiceProxy productServiceProxy;
	
	
	
	
	@GetMapping("/orderdetail")
	public Product getOrderTest() {
		Product list = productServiceProxy.getProduct("110");
		System.out.print(list);
		return list;
	}

	@GetMapping("/testing")
	public String getOrderTesting() {
         String str = "Order Service";
        			System.out.print(str);
		
		return str;
	}
	
	
	
	

}

