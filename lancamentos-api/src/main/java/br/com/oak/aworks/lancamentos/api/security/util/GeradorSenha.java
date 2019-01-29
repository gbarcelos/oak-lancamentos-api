package br.com.oak.aworks.lancamentos.api.security.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class GeradorSenha {

	public static void main(String[] args) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println(encoder.encode("teste"));	
		}
		
	}
}
