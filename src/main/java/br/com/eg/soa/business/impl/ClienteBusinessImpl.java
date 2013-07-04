package br.com.eg.soa.business.impl;

import org.springframework.stereotype.Service;

import br.com.eg.soa.business.ClienteBusiness;
import br.com.eg.soa.canonic.model.cliente.Cliente;

@Service("clienteBusiness")
public class ClienteBusinessImpl implements ClienteBusiness {

	@Override
	public Cliente buscar(Long codigoCliente) {
		// TODO Auto-generated method stub
		return null;
	}

}
