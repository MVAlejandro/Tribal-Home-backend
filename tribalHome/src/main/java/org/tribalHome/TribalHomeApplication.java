package org.tribalHome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.tribalHome.Config.JwtFilter;

@SpringBootApplication
public class TribalHomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(TribalHomeApplication.class, args);
	}

	@Bean
	public FilterRegistrationBean<JwtFilter> jwtFilter(){
		FilterRegistrationBean<JwtFilter> bean = new  FilterRegistrationBean<JwtFilter>();
		bean.setFilter(new JwtFilter());
		bean.addUrlPatterns("/api/productos/*");
		bean.addUrlPatterns("/api/usuarios/*");
		bean.addUrlPatterns("/api/carrito/*");
		return bean;
	}
}
