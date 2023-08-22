package com.example.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

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
}
