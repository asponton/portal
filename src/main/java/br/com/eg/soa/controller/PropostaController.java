package br.com.eg.soa.controller;

import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.eg.soa.business.PropostaBusiness;
import br.com.eg.soa.canonic.model.proposta.Proposta;

@Resource
@Path("/servicos/proposta")
public class PropostaController {
	
	private final PropostaBusiness propostaBusiness;
    private final Result result;
    private final HttpServletRequest request;


	public PropostaController(PropostaBusiness propostaBusiness, Result result, HttpServletRequest request) {
		this.propostaBusiness = propostaBusiness;
		this.result = result;
		this.request = request;
	}
	
	@Get("/cadastrar")
	public void cadastroProposta() {}
	
	@Post("/enviar")
	public void enviarProposta(Proposta proposta) {
		propostaBusiness.gerar(proposta);
		result.forwardTo(this).sucesso();
	}
	
	public void sucesso() {}
}
