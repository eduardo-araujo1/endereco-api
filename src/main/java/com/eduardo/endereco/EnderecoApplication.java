package com.eduardo.endereco;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableFeignClients
public class EnderecoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnderecoApplication.class, args);
	}

}
