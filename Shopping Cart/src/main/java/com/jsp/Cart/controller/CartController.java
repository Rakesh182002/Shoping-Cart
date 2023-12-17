package com.jsp.Cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.jsp.Cart.entity.Cart;
import com.jsp.Cart.service.CartService;

@RestController
public class CartController {

	@Autowired
	private CartService cartService;

	// URL==>http://localhost:8080/cart?item=New product&total=354643==>POST
	@PostMapping("/cart")
	public Cart addStudent(@RequestParam String item, @RequestParam int price) {

		return cartService.addCart(item, price);
	}

	// URL==> http://localhost:8080/find/1==>GET
	@GetMapping("/find/{id}")
	public Cart getCartById(@PathVariable int id) 
	{
		return cartService.getCartById(id);
	}

	//URL==>http://localhost:8080/update?id=1&item=grocery&price=3456
	@GetMapping("/update")
	public Cart updateCart(@RequestParam int id,@RequestParam String item,@RequestParam int price) 
	{
		return cartService.updatecart(id,item,price);
	}
	
	//URL==>http://localhost:8080/delete?id=5==>GET
	@GetMapping("/delete")
	public List<Cart> delete(@RequestParam int id)
	{
		return cartService.delete(id);
	}
	
	//URL==>http://localhost:8080/getall==>GET
	@GetMapping("/getall")
	public List<Cart> getall()
	{
		return cartService.getAll();
	}
	
	
	
	
	
	

}
