package br.com.eg.soa.business;

import br.com.eg.soa.canonic.model.proposta.Proposta;

public interface PdfBusiness {

	Object gerarProposta(Proposta proposta);

}
