package com.br.com.alura.ScreenOne;

import com.br.com.alura.ScreenOne.principal.Principal;
import com.br.com.alura.ScreenOne.repository.SerieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenOneApplication{
	public static void main(String[] args) {
		SpringApplication.run(ScreenOneApplication.class, args);
	}

}
