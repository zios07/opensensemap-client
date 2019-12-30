package com.opensensemap.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.opensensemap.proxy.Measurement;

@Component
public class OpensensemapAPIClient {

	private String measurementURL;

	private final RestTemplate restTemplate;

	public OpensensemapAPIClient(RestTemplate restTemplate, @Value("${api.url}") String url) {
		this.restTemplate = restTemplate;
		measurementURL = url;
	}

	public List<Measurement> getMeasurements() {
		ParameterizedTypeReference<List<Measurement>> parameterizedTypeReference = new ParameterizedTypeReference<List<Measurement>>() {
		};
		System.out.println(measurementURL);
		ResponseEntity<List<Measurement>> measurements = this.restTemplate.exchange(measurementURL, HttpMethod.GET,
				null, parameterizedTypeReference);
		return measurements.getBody();
	}

}
