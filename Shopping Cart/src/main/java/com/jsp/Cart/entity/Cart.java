package com.jsp.Cart.entity;

import org.springframework.stereotype.Controller;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Controller
@Entity
public class Cart {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartId;
	private String  cartItem;
	private int cartTotalBill;
	
	
	public int getCartId() {
		return cartId;
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public String getCartItem() {
		return cartItem;
	}
	public void setCartItem(String cartItem) {
		this.cartItem = cartItem;
	}
	public int getCartTotalBill() {
		return cartTotalBill;
	}
	public void setCartTotalBill(int cartTotalBill) {
		this.cartTotalBill = cartTotalBill;
	}
}
