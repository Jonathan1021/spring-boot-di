package com.example.springboot.di.app.services;

import org.springframework.stereotype.Component;

//@Component("MyServiceComplement")
public class MyServiceComplement implements IService {
	
	@Override
	public String operation() {
		return "Dependency MyServiceComplement Process executing...";
	}

}
