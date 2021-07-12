package com.shopping_cart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ShoppingCartApplication {

	private static final Logger log = LoggerFactory.getLogger(ShoppingCartApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(ShoppingCartApplication.class, args);
		log.info("Starting Shopping Backend: Finish");
	}
}
