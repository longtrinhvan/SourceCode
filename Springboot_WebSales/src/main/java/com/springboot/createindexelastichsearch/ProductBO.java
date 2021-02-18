package com.springboot.createindexelastichsearch;

import java.util.Date;

public class ProductBO {
	
	
	public int id;
	public String name;
	public String image;
	public String unitPrice;
	public String categoryid;
	public Date productDate;
	
	public ProductBO(int id, String name, String image, String unitPrice, String categoryid, Date productDate) {
		super();
		this.id = id;
		this.name = name;
		this.image = image;
		this.unitPrice = unitPrice;
		this.categoryid = categoryid;
		this.productDate = productDate;
	}

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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(String unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategoryid() {
		return categoryid;
	}

	public void setCategoryid(String categoryid) {
		this.categoryid = categoryid;
	}

	public Date getProductDate() {
		return productDate;
	}

	public void setProductDate(Date productDate) {
		this.productDate = productDate;
	}

}
