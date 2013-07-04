package br.com.eg.soa.integration.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.bfmapper.Mapping;
import br.com.eg.soa.canonic.model.proposta.Proposta;
import br.com.eg.soa.canonic.repository.PropostaDataMapper;
import br.com.eg.soa.integration.mysql.egschema.dao.PropostaDao;

@Repository
public class PropostaDataMapperImpl implements PropostaDataMapper{
	
	@Autowired
	private PropostaDao propostaDao;

	@Override
	public List<Proposta> listar() {
		List<Proposta> propostasCanonico = new ArrayList<Proposta>();
		List<br.com.eg.soa.integration.mysql.egschema.model.Proposta> propostasBanco = propostaDao.listar();
		
		for (br.com.eg.soa.integration.mysql.egschema.model.Proposta propostaBanco : propostasBanco) {
			Proposta propostaCanonica = new Mapping().apply(propostaBanco).to(Proposta.class);
			propostasCanonico.add(propostaCanonica);
		}
		
		return propostasCanonico;
	}

	@Override
	public Proposta consultar(Long numeroProposta) {
		br.com.eg.soa.integration.mysql.egschema.model.Proposta propostaBanco = propostaDao.consultar(numeroProposta);
		return new Mapping().apply(propostaBanco).to(Proposta.class);
	}

	@Override
	public void atualizar(Proposta proposta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void criar(Proposta proposta) {
		propostaDao.criar(new Mapping().apply(proposta).to(br.com.eg.soa.integration.mysql.egschema.model.Proposta.class));
	}

}
