package org.tribalHome.Config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.web.filter.GenericFilterBean;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.SignatureException;

public class JwtFilter extends GenericFilterBean {
	
	public static String secret = "TribalHomeecommerce";
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request; 
		String authHeader = httpServletRequest.getHeader("Authorization");
		if ((("POST".equals(httpServletRequest.getMethod())) && (! httpServletRequest.getRequestURI().contains("/api/usuarios/registro"))) ||  
				(("GET".equals(httpServletRequest.getMethod())) && 	(! httpServletRequest.getRequestURI().contains("/api/productos/"))) ||
				("PUT".equals(httpServletRequest.getMethod())) || ("DELETE".equals(httpServletRequest.getMethod()))) {
			
			if(authHeader == null || !authHeader.startsWith("Bearer: ")) {
				System.out.println("1. Invalid Token");
				throw new ServletException("1. Invalid Token");
			}
			String token = authHeader.substring(7);
			try {
				Claims claims = Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
				// Verificamos que si quiere entrar a los endpoints de admin el token debe de ser de admin
				String role = claims.get("role", String.class);
				if(!"admin".equals(role) &&	(
						(("GET".equals(httpServletRequest.getMethod())) && (httpServletRequest.getRequestURI().contains("/api/usuarios/"))) ||
						(("POST".equals(httpServletRequest.getMethod())) && (httpServletRequest.getRequestURI().contains("/api/productos/"))) ||
						(("PUT".equals(httpServletRequest.getMethod())) && (httpServletRequest.getRequestURI().contains("/api/productos/"))) ||
						(("DELETE".equals(httpServletRequest.getMethod())) && (httpServletRequest.getRequestURI().contains("/api/usuarios/") || httpServletRequest.getRequestURI().contains("/api/productos/"))))) {
					System.out.println("2. Invalid Token");
					System.out.println("Acceso denegado. El usuario no es administrador.");
					throw new ServletException("2. Invalid Token");
				}
				claims.forEach((key, value) -> System.out.println("key: " + key + " value: " + value));
			}catch(SignatureException | MalformedJwtException | ExpiredJwtException e){
				System.out.println("3. Invalid Token");
				throw new ServletException("3. Invalid Token");
				
			}
		}
		chain.doFilter(request, response);
	}

}
