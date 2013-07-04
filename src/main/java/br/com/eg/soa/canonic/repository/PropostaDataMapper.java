package br.com.eg.soa.canonic.repository;

import java.util.List;

import br.com.eg.soa.canonic.model.proposta.Proposta;

public interface PropostaDataMapper {
	
	public List<Proposta> listar();
	
	public Proposta consultar(Long numeroProposta);
	
	public void atualizar(Proposta proposta);
	
	public void criar(Proposta proposta);

}
