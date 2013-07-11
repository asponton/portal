package br.com.eg.soa.controller;

import java.util.Calendar;

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
		Calendar calendar = Calendar.getInstance();
		result.include("data", calendar);
		result.redirectTo("index.jsp");
	}

}
