package br.com.eg.soa.mock.mapping;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.stereotype.Service;

import br.com.bfmapper.Mapping;
import br.com.eg.soa.canonic.model.cliente.Cliente;
import br.com.eg.soa.canonic.model.proposta.Proposta;
import br.com.eg.soa.canonic.model.proposta.StatusProposta;
import br.com.eg.soa.mock.BaseTest;

@Service
public class PropostaMappingRulesTest extends BaseTest {
	
	@Test
	public void testaMapeamentoPropostaCanonicoToBanco() {
		List<Long> telefones = new ArrayList<Long>();
		telefones.add(1123314690L);
		telefones.add(11982056247L);
		
		Cliente cliente = new Cliente("André Sponton Moura", null, "asponton@gmail.com", telefones, 10602257000177L, null); 
		
		Proposta propostaCanonica = new Proposta(Calendar.getInstance(), cliente, StatusProposta.APROVADA, BigDecimal.valueOf(13500L));
		br.com.eg.soa.integration.mysql.egschema.model.Proposta propostaBanco = new Mapping().apply(propostaCanonica).to(br.com.eg.soa.integration.mysql.egschema.model.Proposta.class);
		System.out.println(propostaBanco);
		
		Assert.assertNotNull(propostaBanco);
		
	}

}
