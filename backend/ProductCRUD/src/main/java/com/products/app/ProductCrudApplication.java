package com.products.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.products", "com.products.app"})
public class ProductCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductCrudApplication.class, args);
	}

}
