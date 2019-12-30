package com.opensensemap.configuration;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
public class RestClientConfiguration {

	@Bean
	public RestTemplate restTemplate() {
		RestTemplate rest = new RestTemplate();

		ObjectMapper lax = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

		MappingJackson2HttpMessageConverter c = new MappingJackson2HttpMessageConverter();
		c.setObjectMapper(lax);

		List<HttpMessageConverter<?>> list = new ArrayList<>();
		list.add(c);

		rest.setMessageConverters(list);
		return rest;
	}

}
