package com.aurorabeauty.entity;



import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="WarehouseDetail_TBL")
public class WarehouseDetail implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne(optional=false)
    @JoinColumn(name = "warehouse_id",referencedColumnName="id_warehouse")
	private Warehouse warehouse;
	@Id
	@ManyToOne(optional=false)
	@JoinColumn(name="product_id",referencedColumnName = "id_product")
	private Product product;
	
	private int quantity;
	public Warehouse getWarehouse() {
		return warehouse;
	}
	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
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
