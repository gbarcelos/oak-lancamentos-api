package br.com.oak.aworks.lancamentos.api.config;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

import br.com.oak.aworks.lancamentos.api.config.property.LancamentosApiProperty;
import br.com.oak.aworks.lancamentos.api.security.AppUserDetailsService;
import br.com.oak.aworks.lancamentos.api.security.LancamentoPasswordEncoder;

@Profile("basic-security")
@EnableWebSecurity
public class BasicSecurityConfig extends WebSecurityConfigurerAdapter {
	
	private static final Logger LOGGER = Logger.getLogger(BasicSecurityConfig.class);

	@Autowired
	private UserDetailsService userDetailsService;
	
	@Autowired
	private LancamentosApiProperty lancamentosApiProperty;

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		String originPermitida = lancamentosApiProperty.getOriginPermitida();
		
		LOGGER.log(Level.INFO, " -> configure(AuthenticationManagerBuilder auth)");
		
		LOGGER.log(Level.INFO, " -> originPermitida: " + originPermitida);
		
		auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new LancamentoPasswordEncoder();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().anyRequest().authenticated().and().httpBasic().and().sessionManagement()
				.sessionCreationPolicy(SessionCreationPolicy.STATELESS).and().csrf().disable();
	}
}