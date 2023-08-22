package com.example.springboot.di.app.services;

//@Component("MyServiceComplement")
public class MyServiceComplement implements IService {
	
	@Override
	public String operation() {
		return "Dependency MyServiceComplement Process executing...";
	}

}
