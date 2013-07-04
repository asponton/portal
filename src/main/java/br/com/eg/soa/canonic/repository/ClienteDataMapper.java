package br.com.eg.soa.canonic.repository;

import br.com.eg.soa.canonic.model.cliente.Cliente;

public interface ClienteDataMapper {

	Cliente buscar(Long codigoCliente);

}
