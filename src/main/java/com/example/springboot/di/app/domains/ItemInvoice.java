package com.example.springboot.di.app.domains;

public class ItemInvoice {

	private Product product;
	private Integer cant;

	public ItemInvoice(Product product, Integer cant) {
		this.product = product;
		this.cant = cant;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getCant() {
		return cant;
	}

	public void setCant(Integer cant) {
		this.cant = cant;
	}
	
	public Integer calculated() {
		return this.cant * this.product.getValue();
	}

}
