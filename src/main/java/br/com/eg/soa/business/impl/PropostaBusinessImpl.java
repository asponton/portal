package br.com.eg.soa.business.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eg.soa.business.ClienteBusiness;
import br.com.eg.soa.business.MailServiceBusiness;
import br.com.eg.soa.business.PdfBusiness;
import br.com.eg.soa.business.PropostaBusiness;
import br.com.eg.soa.canonic.model.proposta.Proposta;
import br.com.eg.soa.canonic.repository.PropostaDataMapper;

@Service("propostaBusiness")
public class PropostaBusinessImpl implements PropostaBusiness {
	
	@Autowired
	private PropostaDataMapper propostaDataMapper;
	
	@Autowired
	private ClienteBusiness clienteBusiness;
	
	@Autowired
	private PdfBusiness pdfBusiness;
	
	@Autowired
	private MailServiceBusiness mailServiceBusiness;
	
	@Override
	public List<Proposta> listar() {
		return propostaDataMapper.listar();
	}

	@Override
	public Proposta consultar(Long numeroProposta) {
		return propostaDataMapper.consultar(numeroProposta);
	}

	@Override
	public void atualizar(Proposta proposta) {
		propostaDataMapper.atualizar(proposta);
	}

	private void criar(Proposta proposta) {
		propostaDataMapper.criar(proposta);
	}

	private void enviar(Proposta proposta) {
		mailServiceBusiness.enviarProposta(pdfBusiness.gerarProposta(proposta));
	}

	@Override
	public void gerar(Proposta proposta) {
		this.criar(proposta);
		this.enviar(proposta);
	}

}
