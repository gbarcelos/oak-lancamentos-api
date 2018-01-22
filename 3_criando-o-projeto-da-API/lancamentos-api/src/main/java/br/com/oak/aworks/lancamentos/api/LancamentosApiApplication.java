package br.com.oak.aworks.lancamentos.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import br.com.oak.aworks.lancamentos.api.config.property.LancamentosApiProperty;

@SpringBootApplication
@EnableConfigurationProperties(LancamentosApiProperty.class)
public class LancamentosApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LancamentosApiApplication.class, args);
	}
}
