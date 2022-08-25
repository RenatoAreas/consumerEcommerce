package com.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class EcommerceConsumerEmailmessageApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceConsumerEmailmessageApplication.class, args);
	}

}
