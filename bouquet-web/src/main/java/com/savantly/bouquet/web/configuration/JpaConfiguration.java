package com.savantly.bouquet.web.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(JpaConfiguration.data)
@EntityScan(JpaConfiguration.entityPackage)
@ComponentScan(JpaConfiguration.data)
public class JpaConfiguration {
	
	protected static final String data = "com.savantly.bouquet.data";
	protected static final String entityPackage = "com.savantly.bouquet.data.entity";
	
}