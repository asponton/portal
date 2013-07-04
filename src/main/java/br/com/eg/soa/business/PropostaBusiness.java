package br.com.eg.soa.business;

import java.util.List;

import br.com.eg.soa.canonic.model.proposta.Proposta;

public interface PropostaBusiness {

	public List<Proposta> listar();
	
	public Proposta consultar(Long numeroProposta);
	
	public void atualizar(Proposta proposta);
	
	public void gerar(Proposta proposta);
}
