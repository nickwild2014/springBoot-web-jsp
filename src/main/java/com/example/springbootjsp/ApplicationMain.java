package com.example.springbootjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.Banner;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

import javax.servlet.ServletContextListener;
import java.util.Arrays;

@SpringBootApplication
public class ApplicationMain {

	//http://localhost:9080/path2/
	public static void main(String[] args) {
		SpringApplication sa = new SpringApplication(ApplicationMain.class);
		sa.setLogStartupInfo(false);
		sa.setBannerMode(Banner.Mode.OFF);
		sa.run(args);
	}

	@Bean
	FilterRegistrationBean myFilterRegistration() {
		FilterRegistrationBean frb = new FilterRegistrationBean();
		frb.setFilter(new MyFilter());
		frb.setUrlPatterns(Arrays.asList("/*"));
		return frb;
	}

	@Bean
	ServletRegistrationBean myServletRegistration() {
		ServletRegistrationBean srb = new ServletRegistrationBean();
		srb.setServlet(new MyServlet());
		srb.setUrlMappings(Arrays.asList("/path2/*"));
		return srb;
	}

	@Bean
	ServletListenerRegistrationBean<ServletContextListener> myServletListener() {
		ServletListenerRegistrationBean<ServletContextListener> srb = new ServletListenerRegistrationBean<>();
		srb.setListener(new MyServletListener());
		return srb;
	}
}
