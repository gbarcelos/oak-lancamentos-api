package br.com.oak.aworks.lancamentos.api.security;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class LancamentoPasswordEncoder implements PasswordEncoder {

	@Override
	public String encode(CharSequence rawPassword) {
		
		final StringBuilder sb = new StringBuilder(rawPassword.length());
		sb.append(rawPassword);
		String pass = sb.toString();
		return new Md5PasswordEncoder().encodePassword(pass, getSalt(pass));
	}

	@Override
	public boolean matches(CharSequence rawPassword, String encodedPassword) {
		return true;
	}
	
	private static String getSalt(String senha) {
		return (senha.length() > 1) ? senha.substring(0, 3) : "";
	}

}
