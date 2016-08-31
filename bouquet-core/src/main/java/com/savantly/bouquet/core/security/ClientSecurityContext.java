package com.savantly.bouquet.core.security;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class ClientSecurityContext {

	private boolean anonymous;
	private Object authenticated;
	private Object principal;
	private boolean rememberMe;
	private Collection<? extends GrantedAuthority> authorities;
	private boolean fullyAuthenticated;

	public void setAnonymous(boolean anonymous) {
		this.anonymous = anonymous;
	}

	public void setAuthenticated(boolean authenticated) {
		this.authenticated = authenticated;
	}

	public void setFullyAuthenticated(boolean fullyAuthenticated) {
		this.fullyAuthenticated = fullyAuthenticated;
	}

	public void setPrincipal(Object principal) {
		this.principal = principal;
	}

	public void setRememberMe(boolean rememberMe) {
		this.rememberMe = rememberMe;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	public Object getAuthenticated() {
		return authenticated;
	}

	public void setAuthenticated(Object authenticated) {
		this.authenticated = authenticated;
	}

	public boolean isAnonymous() {
		return anonymous;
	}

	public Object getPrincipal() {
		return principal;
	}

	public boolean isRememberMe() {
		return rememberMe;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public boolean isFullyAuthenticated() {
		return fullyAuthenticated;
	}

	

}
