package com.mashibing.apipassenger.feign.config;

import com.mashibing.apipassenger.annotation.ExcudeFeignConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import feign.auth.BasicAuthRequestInterceptor;
@ExcudeFeignConfig
public class FeignAuthConfiguration {
	
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("root", "root");
	}
}