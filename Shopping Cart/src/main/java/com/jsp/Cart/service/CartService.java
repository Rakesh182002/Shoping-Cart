package com.jsp.Cart.service;

import org.springframework.stereotype.Service;

import com.jsp.Cart.entity.Cart;
import com.jsp.Cart.repository.CartRepo;

import java.util.List;
import java.util.Optional;

//StudentService.java
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class CartService {

	@Autowired
	private CartRepo cartrepo;

	@Autowired
	private Cart cart;

	// Add-Student
	public Cart addCart(String item, int price) 
	{
		cart.setCartId(0);
		cart.setCartItem(item);
		cart.setCartTotalBill(price);

		return cartrepo.save(cart);
	}

	// GetStudent==>Id
	public Cart getCartById(int id) 
	{
		Optional<Cart> optional = cartrepo.findById(id);

		if (optional != null) 
		{

			Cart cart = optional.get();
			cart.getCartId();
			cart.getCartItem();
			cart.getCartTotalBill();

			return cart;
		}
		
		else 
		{
	        throw new RuntimeException("Cart with ID " + id + " not found");
		}
	}
	
	//Update
	public Cart updatecart(int id, String item, int price) 
	{
		cart.setCartId(id);
		cart.setCartItem(item);
		cart.setCartTotalBill(price);

		return cartrepo.save(cart);

	}

	//Delete
	public List<Cart> delete(int id) 
	{	
		cartrepo.deleteById(id);
		
		return getAll();
	}

	//GetAll
	public List<Cart> getAll() 
	{
		List<Cart>findAll= cartrepo.findAll();
		
		return findAll;
	}

}