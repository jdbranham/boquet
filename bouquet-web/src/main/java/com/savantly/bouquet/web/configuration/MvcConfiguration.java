package com.savantly.bouquet.web.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.resource.PathResourceResolver;

@Configuration
@EnableWebMvc
public class MvcConfiguration extends WebMvcConfigurerAdapter {
	
	private int defaultCacheSeconds = 0;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
    	//registry.addViewController("/").setViewName("forward:index.html");
        registry.addViewController("/login").setViewName("login");
    }
    
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("/**")
          .addResourceLocations("/","classpath:/public/")
          .setCachePeriod(defaultCacheSeconds)
          .resourceChain(true)
          .addResolver(new PathResourceResolver());
    }

	public int getDefaultCacheMs() {
		return defaultCacheSeconds;
	}

	public void setDefaultCacheMs(int defaultCacheMs) {
		this.defaultCacheSeconds = defaultCacheMs;
	}

}