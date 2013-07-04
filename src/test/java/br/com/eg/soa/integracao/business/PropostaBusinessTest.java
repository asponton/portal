package br.com.eg.soa.integracao.business;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.eg.soa.business.PropostaBusiness;
import br.com.eg.soa.canonic.model.proposta.Proposta;
import br.com.eg.soa.integracao.BaseIntegration;

public class PropostaBusinessTest extends BaseIntegration{
	
	@Autowired
	PropostaBusiness propostaBusiness;
	
	@Test
	public void testaConsultaProposta() {
		Proposta proposta = propostaBusiness.consultar(new Long(1L));
		Assert.assertNotNull(proposta);
	}

}
