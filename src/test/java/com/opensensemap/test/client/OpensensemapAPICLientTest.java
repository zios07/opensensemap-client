package com.opensensemap.test.client;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.opensensemap.proxy.Measurement;

@SpringBootTest
public class OpensensemapAPICLientTest {

	private String Url;

	public OpensensemapAPICLientTest(@Value("${api.url}") String Url) {
		this.Url = Url;
	}

	@Test
	public void getMeasurementsTest() {
		TestRestTemplate testRestTemplate = new TestRestTemplate();
		ParameterizedTypeReference<List<Measurement>> parameterizedTypeReference = new ParameterizedTypeReference<List<Measurement>>() {
		};
		ResponseEntity<List<Measurement>> response = testRestTemplate.exchange(Url, HttpMethod.GET, null,
				parameterizedTypeReference);

		assertEquals(response.getStatusCode(), HttpStatus.OK);
	}

}
