package org.zeronight.spm;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.multipart.support.MultipartFilter;

public class SpringSecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	
	public SpringSecurityInitializer() {
        super(WebSecurityConfig.class);
    }
	
	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
		insertFilters(servletContext, new MultipartFilter());
	}
}
