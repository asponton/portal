package br.com.eg.soa.canonic.model.proposta;

public enum StatusProposta {

	APROVADA, EM_NEGOCIACAO, ENVIADA, CANCELADA;

	public String value() {
		return name();
	}

	public static StatusProposta fromValue(String v) {
		return valueOf(v);
	}
}
