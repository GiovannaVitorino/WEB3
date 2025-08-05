package br.edu.ifspcjo.ads.web3.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Impressora impressora() {
		return new ImpressoraHP();
	}
	
	@Bean
	public Checkout checkout(Impressora impressora) {
		return new Checkout(impressora);
	}
	
}
