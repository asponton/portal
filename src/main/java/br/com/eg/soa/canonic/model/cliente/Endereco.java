package br.com.eg.soa.canonic.model.cliente;

import java.io.Serializable;

import org.apache.commons.lang.StringUtils;

import lombok.Data;

public @Data class Endereco implements Serializable {

	private static final long serialVersionUID = -8712767276689101272L;
	
    private String cep;

    private String logradouro;
    
    private String numero;
    
    private String complemento;
    
    private String bairro;
    
    private String cidade;
    
    private Uf uf;
    
    public String getDisplayValue() {
    	return this.logradouro + ", " + StringUtils.defaultIfEmpty(this.numero, "") + " " + StringUtils.defaultIfEmpty(this.complemento, "");
    }

    public String getValue() {
    	return this.getDisplayValue();
    }

	public static enum Uf {
        AC("Acre"),
        AL("Alagoas"),
        AP("Amapá"),
        AM("Amazonas"),
        BA("Bahia"),
        CE("Ceará"),
        DF("Distrito Federal"),
        ES("Espírito Santo"),
        GO("Goiás"),
        MA("Maranhão"),
        MS("Mato Grosso do Sul"),
        MT("Mato Grosso"),
        MG("Minas Gerais"),
        PA("Pará"),
        PB("Paraíba"),
        PR("Paraná"),
        PE("Pernambuco"),
        PI("Piauí"),
        RJ("Rio de Janeiro"),
        RN("Rio Grande do Norte"),
        RS("Rio Grande do Sul"),
        RO("Rondônia"),
        RR("Roraima"),
        SC("Santa Catarina"),
        SP("São Paulo"),
        SE("Sergipe"),
        TO("Tocantins");
        
        private String nome;
        
        private Uf(String nome) {
            this.nome = nome;
        }
        
        public String getNome() {
            return this.nome;
        }

		public static Uf fromValue(String uf) {
			if (uf == null) return null;
			return Uf.valueOf(uf.toUpperCase());
		}

	}

}
