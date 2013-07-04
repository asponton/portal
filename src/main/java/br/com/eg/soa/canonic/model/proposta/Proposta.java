package br.com.eg.soa.canonic.model.proposta;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import br.com.eg.soa.canonic.model.cliente.Cliente;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of="codigo")
public @Data class Proposta implements Serializable{
	
	private static final long serialVersionUID = 1103130659586915269L;

	private Long codigo;
	
	private Calendar data;
	
	private Cliente cliente;
	
	private StatusProposta status;
	
	private BigDecimal valor;

	public Proposta(Calendar data, Cliente cliente, StatusProposta status, BigDecimal valor) {
		this.data = data;
		this.cliente = cliente;
		this.status = status;
		this.valor = valor;
	}

	public Proposta() {}

}
