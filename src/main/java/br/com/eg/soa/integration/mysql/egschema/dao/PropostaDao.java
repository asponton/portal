package br.com.eg.soa.integration.mysql.egschema.dao;

import java.util.List;

import br.com.eg.soa.integration.mysql.egschema.model.Proposta;


public interface PropostaDao {
	
	List<Proposta> listar();
	
	Proposta consultar(Long numeroProposta);
	
	void atualizar(Proposta proposta);
	
	void criar(Proposta proposta);

}
