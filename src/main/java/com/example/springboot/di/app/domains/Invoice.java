package com.example.springboot.di.app.domains;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@RequestScope
public class Invoice implements Serializable {

	private static final long serialVersionUID = 873933384107065370L;

	@Autowired
	private Client client;
	
	@Value("${invoice.description}")
	private String description;

	@Autowired
	private List<ItemInvoice> items;
	
	@PostConstruct
	public void init() {
		this.client.setName(this.client.getName().concat(" ").concat("Alfonso"));
		this.description = this.getDescription().concat(" Factura concatenada ");
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Factura Destruida ".concat(description));
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<ItemInvoice> getItems() {
		return items;
	}

	public void setItems(List<ItemInvoice> items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Invoice [client=" + client.toString() + ", description=" + description + ", items=" + items.toString() + "]";
	}
	
}
