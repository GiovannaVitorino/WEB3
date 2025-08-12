package br.edu.ifspcjo.ads.web3.ioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Checkout {

	@Autowired
	@Qualifier("impressoraEpson") 
	private Impressora impressora;
	
	public void finalizar() {
		// regras de negócio
		
		impressora.imprimir("Compra 1");
	}

}
 