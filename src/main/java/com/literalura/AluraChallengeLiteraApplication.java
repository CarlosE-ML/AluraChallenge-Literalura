package com.literalura;

import com.literalura.principal.Principal;
import com.literalura.repository.IAutorRepository;
import com.literalura.repository.ILibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AluraChallengeLiteraApplication implements CommandLineRunner {

	@Autowired
	private IAutorRepository autorRepositorio;
	@Autowired
	private ILibroRepository libroRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(AluraChallengeLiteraApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(autorRepositorio,libroRepositorio);
		principal.muestraElMenu();
	}
}
