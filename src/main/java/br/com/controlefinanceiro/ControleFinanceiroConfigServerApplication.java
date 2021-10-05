package br.com.controlefinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ControleFinanceiroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControleFinanceiroConfigServerApplication.class, args);
	}

}
