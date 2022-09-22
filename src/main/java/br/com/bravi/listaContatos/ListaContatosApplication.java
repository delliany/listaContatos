package br.com.bravi.listaContatos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@EntityScan(basePackages = "br.com.bravi.listaContatos.entity")
//@EnableJpaRepositories(basePackages = "br.com.bravi.listaContatos.repository") 
//@SpringBootApplication(scanBasePackages = "br.com.bravi.listaContatos")
@SpringBootApplication
public class ListaContatosApplication {

	public static void main(String[] args) {
		SpringApplication.run(ListaContatosApplication.class, args);
	}

}
