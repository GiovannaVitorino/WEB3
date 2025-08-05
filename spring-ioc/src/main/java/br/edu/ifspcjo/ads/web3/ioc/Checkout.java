package br.edu.ifspcjo.ads.web3.ioc;

public class Checkout {
	private Impressora impressora;
	
	public Checkout(Impressora impressora) {
		this.impressora = impressora;
	}
	public void finalizar(){
		//regras de negócio
		
		impressora.imprimir("Compra 1");
	}
	

}
