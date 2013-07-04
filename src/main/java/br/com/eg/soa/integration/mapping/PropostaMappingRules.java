package br.com.eg.soa.integration.mapping;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import br.com.bfmapper.Converter;
import br.com.bfmapper.MappingRules;
import br.com.bfmapper.RulesMapper;
import br.com.eg.soa.canonic.model.proposta.Proposta;

@Service
public class PropostaMappingRules implements RulesMapper {

	@Override
	@PostConstruct
	public void loadRules() {
		MappingRules.addRule(new Converter(Proposta.class, br.com.eg.soa.integration.mysql.egschema.model.Proposta.class) {
			{
				add("codigo", "id");
			}
		});
	}

}
