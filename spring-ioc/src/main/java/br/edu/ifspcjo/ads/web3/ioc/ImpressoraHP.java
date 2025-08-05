package br.edu.ifspcjo.ads.web3.ioc;

public class ImpressoraHP implements Impressora {
	
	@Override
	public void imprimir(String documento){
		System.out.println("Imprimindo na HP: " + documento);
	}
}
