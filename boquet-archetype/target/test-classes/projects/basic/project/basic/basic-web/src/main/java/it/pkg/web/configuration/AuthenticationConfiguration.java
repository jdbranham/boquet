package it.pkg.web.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configurers.GlobalAuthenticationConfigurerAdapter;

//@Configuration
// Disabled until need to customize
public class AuthenticationConfiguration extends GlobalAuthenticationConfigurerAdapter {

	@Autowired
	SecurityProperties securityProperties;

	@Override
	public void init(AuthenticationManagerBuilder auth) throws Exception {
		User user = securityProperties.getUser();
		auth.inMemoryAuthentication().withUser(user.getName()).password(user.getPassword());
	}
}