package com.aurorabeauty.entity;

import java.io.Serializable;

import javax.persistence.*;
@Entity
@Table(name="orderdetail_tbl")
public class OrderDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name="order_id", referencedColumnName = "id_order")
	private Order order;
	@Id
	@ManyToOne(optional = false)
	@JoinColumn(name="product_id", referencedColumnName = "id_product")
	private Product product;
	private int quantity;
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
}
