package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication

/*Detecta la clase de persistencia para inyectarla desde
 * un paquete diferente
 */
@EnableJpaRepositories("com.example.crud")

/* Detecta las entidades para inyectarlas
 * desde diferentes paquetes.
 */
@EntityScan("com.example.pojo")
public class SpringBbddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBbddApplication.class, args);
	}

}
