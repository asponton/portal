package br.com.eg.soa.canonic.model.cliente;

import java.io.Serializable;
import java.util.List;


import com.mysql.jdbc.Blob;

import lombok.Data;

public @Data class Cliente implements Serializable{

	private static final long serialVersionUID = 4010064266570492547L;
	
	private String nome;
	
	private Long codigo;
	
	private Blob logo;
	
	private String email;
	
	private List<Long> telefones;
	
	private Long cnpj;
	
	private Endereco endereco;
	
	public Cliente() {}

	public Cliente(String nome, Blob logo, String email, List<Long> telefones, Long cnpj, Endereco endereco) {
		this.nome = nome;
		this.logo = logo;
		this.email = email;
		this.telefones = telefones;
		this.cnpj = cnpj;
		this.endereco = endereco;
	}

	
}
