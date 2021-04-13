package com.aurorabeauty.entity;



import javax.persistence.*;

@Entity
@Table(name="product_tbl")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_product")
	private int id;
	private String name;
	private float price;
	private long quantity;
	private String imageUrl;
	@ManyToOne(optional=false)
    @JoinColumn(name = "partner_id",referencedColumnName="id_partner")
    private Partner partner;
	@ManyToOne(optional=false)
    @JoinColumn(name = "producttype_id",referencedColumnName="id_producttype")
    private ProductType productType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public Partner getPartner() {
		return partner;
	}
	public void setPartner(Partner partner) {
		this.partner = partner;
	}
	public ProductType getProductType() {
		return productType;
	}
	public void setProductType(ProductType productType) {
		this.productType = productType;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	
	
	
	
	
	
}
