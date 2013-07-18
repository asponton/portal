package br.com.eg.soa.controller;

import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
@Path("/")
public class RootController {
	
	private Result result;
	
	public RootController(Result result) {
		this.result = result;
	}
	
	@Path("")
	public void redirect() {
		result.redirectTo(HomeController.class).index();
	}

}
