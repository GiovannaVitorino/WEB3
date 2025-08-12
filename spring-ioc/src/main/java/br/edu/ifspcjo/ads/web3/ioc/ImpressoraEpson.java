package br.edu.ifspcjo.ads.web3.ioc;

import org.springframework.stereotype.Component;

@Component
public class ImpressoraEpson implements Impressora {

	@Override
	public void imprimir(String documento) {
		System.out.println("Imprimindo na Epson: " + documento);
	}

}