package com.example.springboot.di.app.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("MyService")
public class MyService implements IService {
	
	@Override
	public String operation() {
		return "Dependency Interface Process executing...";
	}

}
