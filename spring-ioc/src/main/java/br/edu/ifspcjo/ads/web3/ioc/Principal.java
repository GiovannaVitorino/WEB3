package br.edu.ifspcjo.ads.web3.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import br.edu.ifspcjo.ads.web3.ioc.config.AppConfig;

public class Principal {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Checkout checkout = context.getBean(Checkout.class);
		checkout.finalizar();
		
		((ConfigurableApplicationContext) context).close();
	}
	
}
