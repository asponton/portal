package br.com.eg.soa.business;

import br.com.eg.soa.canonic.model.cliente.Cliente;

public interface ClienteBusiness {

	Cliente buscar(Long codigoCliente);

}
