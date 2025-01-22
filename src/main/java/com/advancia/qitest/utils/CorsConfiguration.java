package com.advancia.qitest.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration {

	@Value("${cors.allowed.origins}")
	private String corsAllowedOrigins;

	@Bean
	WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins(corsAllowedOrigins.split(","))
						.allowedHeaders("Authorization", "Content-Type", "Accept", "Origin", "X-Requested-With")
						.allowCredentials(true).allowedMethods(HttpMethod.DELETE.toString(), HttpMethod.GET.toString(),
								HttpMethod.HEAD.toString(), HttpMethod.OPTIONS.toString(), HttpMethod.PATCH.toString(),
								HttpMethod.POST.toString(), HttpMethod.PUT.toString(), HttpMethod.TRACE.toString());
			}
		};
	}
};