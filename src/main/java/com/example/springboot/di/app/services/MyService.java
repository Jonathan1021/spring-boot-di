package com.example.springboot.di.app.services;

//@Component("MyService")
public class MyService implements IService {
	
	@Override
	public String operation() {
		return "Dependency MyService Process executing...";
	}

}
