package com.apiadev.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "tbfatura")
public class Fatura {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String formaPagamento;
	
	private Long valorMensal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(String formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Long getValorMensal() {
		return valorMensal;
	}

	public void setValorMensal(Long valorMensal) {
		this.valorMensal = valorMensal;
	}
	
	
	
}
