package com.tayana.cursomc.domain.enums;

public enum EstadoPagamento {

	PENDENTE(1, "Pendente"),
	QUITADO(2, "Quitado"),
	CANCELADO(3, "Cancelado");
	
	private EstadoPagamento(int cod, String descricao){
		this.cod = cod;
		this.descricao = descricao;
	}

	private int cod;
	private String descricao;
	
	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public static EstadoPagamento toEnum(Integer cod) {
		if(cod == null) {
			return null;
		}
		for(EstadoPagamento tipo: EstadoPagamento.values()) {
			if(cod.equals(tipo.getCod())) {
				return tipo;
			}
		}
		throw new IllegalArgumentException("Id incorreto!");
	}

}
