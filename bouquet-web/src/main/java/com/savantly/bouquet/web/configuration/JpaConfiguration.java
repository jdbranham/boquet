package com.savantly.bouquet.web.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(JpaConfiguration.data)
@ComponentScan(JpaConfiguration.data)
public class JpaConfiguration {
	
	protected static final String data = "com.savantly.bouquet.data";
	
}