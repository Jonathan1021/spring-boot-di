package com.example.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.springboot.di.app.domains.ItemInvoice;
import com.example.springboot.di.app.domains.Product;
import com.example.springboot.di.app.services.IService;
import com.example.springboot.di.app.services.MyService;
import com.example.springboot.di.app.services.MyServiceComplement;

@Configuration
public class AppConfig {

	@Primary
	@Bean("MyService")
	public IService registryMyService() {
		return new MyService();
	}
	
	@Bean("MyServiceComplement")
	public IService registryMyServiceComplement() {
		return new MyServiceComplement();
	}
	
	@Bean("ItemsInvoice")
	public List<ItemInvoice> registryItemsInvoice() {
		Product product1 = new Product("Camara Sony", 100);
		Product product2 = new Product("Bicicleta", 200);
		
		ItemInvoice item1 = new ItemInvoice(product1, 1);
		ItemInvoice item2 = new ItemInvoice(product2, 2);
		return Arrays.asList(item1, item2);
	}
}
