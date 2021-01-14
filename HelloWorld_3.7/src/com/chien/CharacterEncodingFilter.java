package com.chien;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

@WebFilter(filterName = "CharacterEncodingFilter", urlPatterns = {"/*"}, 
			initParams = {@WebInitParam(name = "encoding", value = "UTF-8")})
public class CharacterEncodingFilter implements Filter {

    protected String encoding;

    public void init(FilterConfig config) throws ServletException {
        encoding = config.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest reqest, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        if (encoding != null) {
        	reqest.setCharacterEncoding(encoding);
        }
        chain.doFilter(reqest, response);
    }

    public void destroy() {
        encoding = null;
    }

}
