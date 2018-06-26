package br.com.oak.aworks.lancamentos.api.config.property;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("lancamentosapiproperty")
public class LancamentosApiProperty {

	// http://www.baeldung.com/configuration-properties-in-spring-boot

	private String originPermitida = "http://localhost:4200";
//	private String originPermitida = "http://localhost:8080";

	private final Seguranca seguranca = new Seguranca();

	public Seguranca getSeguranca() {
		return seguranca;
	}

	public String getOriginPermitida() {
		return originPermitida;
	}

	public void setOriginPermitida(String originPermitida) {
		this.originPermitida = originPermitida;
	}

	public static class Seguranca {

		private boolean enableHttps;

		public boolean isEnableHttps() {
			return enableHttps;
		}

		public void setEnableHttps(boolean enableHttps) {
			this.enableHttps = enableHttps;
		}
	}
}
