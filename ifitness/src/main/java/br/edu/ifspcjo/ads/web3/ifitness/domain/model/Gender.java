package br.edu.ifspcjo.ads.web3.ifitness.domain.model;

public enum Gender {
	
	MASCULINO("Masculino"),
	FEMININO("feminino"),
	OUTRO("Outro"),
	PREFIRO_NÃO_DIZER("Prefiro não dizer");
	
	private String description;

	private Gender(String description) {
		this.description = description;
	
	}

	public String getDescription() {
		return description;
	}
}

