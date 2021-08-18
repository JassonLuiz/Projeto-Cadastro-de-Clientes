package io.github.jassonluizjr.clientes;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import io.github.jassonluizjr.clientes.model.entity.Cliente;
import io.github.jassonluizjr.clientes.model.repository.ClienteRepository;

@SpringBootApplication
public class ClientesApplication {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ClientesApplication.class, args);
	}
}
