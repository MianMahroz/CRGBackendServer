package com.bestercapitalmedia.chiragh.oauth.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

// TODO: Auto-generated Javadoc
/**
 * The Class AuthorizationServerConfig.
 */
@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

	/** The Constant CLIEN_ID. */
	static final String CLIEN_ID = "chiragh-client";
	
	/** The Constant CLIENT_SECRET. */
	static final String CLIENT_SECRET = "$2a$04$e/c1/RfsWuThaWFCrcCuJeoyvwCV0URN/6Pn9ZFlrtIWaU/vj/BfG";//devglan-secret
//	static final String CLIENT_SECRET = "$2b$10$jiuop9vfGU4fkvwJNMvPUuOlFOmMZdoOnKeuOmP7Mo5Ml7vmlKGX";//password
	
	/** The Constant GRANT_TYPE_PASSWORD. */
static final String GRANT_TYPE_PASSWORD = "password";
	
	/** The Constant AUTHORIZATION_CODE. */
	static final String AUTHORIZATION_CODE = "authorization_code";
	
	/** The Constant REFRESH_TOKEN. */
	static final String REFRESH_TOKEN = "refresh_token";
	
	/** The Constant IMPLICIT. */
	static final String IMPLICIT = "implicit";
	
	/** The Constant SCOPE_READ. */
	static final String SCOPE_READ = "read";
	
	/** The Constant SCOPE_WRITE. */
	static final String SCOPE_WRITE = "write";
	
	/** The Constant TRUST. */
	static final String TRUST = "trust";
	
	/** The Constant ACCESS_TOKEN_VALIDITY_SECONDS. */
	static final int ACCESS_TOKEN_VALIDITY_SECONDS = 1 * 60 * 60;
	
	/** The Constant FREFRESH_TOKEN_VALIDITY_SECONDS. */
	static final int FREFRESH_TOKEN_VALIDITY_SECONDS = 6 * 60 * 60;

	/** The token store. */
	@Autowired
	private TokenStore tokenStore;

	/** The authentication manager. */
	@Autowired
	private AuthenticationManager authenticationManager;

	/* (non-Javadoc)
	 * @see org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter#configure(org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer)
	 */
	@Override
	public void configure(ClientDetailsServiceConfigurer configurer) throws Exception {

		configurer.inMemory().withClient(CLIEN_ID).secret(CLIENT_SECRET)
				.authorizedGrantTypes(GRANT_TYPE_PASSWORD, AUTHORIZATION_CODE, REFRESH_TOKEN, IMPLICIT)
				.scopes(SCOPE_READ, SCOPE_WRITE, TRUST).accessTokenValiditySeconds(ACCESS_TOKEN_VALIDITY_SECONDS)
				.refreshTokenValiditySeconds(FREFRESH_TOKEN_VALIDITY_SECONDS);
	}

	/* (non-Javadoc)
	 * @see org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter#configure(org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer)
	 */
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(tokenStore).authenticationManager(authenticationManager);
	}
}