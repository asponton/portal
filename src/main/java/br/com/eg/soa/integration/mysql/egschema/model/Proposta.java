package br.com.eg.soa.integration.mysql.egschema.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@EqualsAndHashCode(of="id")
public @Data class Proposta implements Serializable{

	private static final long serialVersionUID = -1749233015647223994L;

	@Id @GeneratedValue
	@Column(name="ID")
	private Long id;
	
	@Column(name="DATA_ENVIO")
	private Calendar data;
	
	@Column(name="ID_CLIENTE")
	private Long codigoCliente;
	
	@Column(name="STATUS")
	private String status;
	
	@Column(name="VALOR")
	private BigDecimal valor;
	
}
