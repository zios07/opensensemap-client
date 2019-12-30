package com.opensensemap.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.opensensemap.entity.AverageTemperature;
import com.opensensemap.service.TemperatureService;

@RestController
@RequestMapping(value = "temperature")
public class TemperatureController {

	private TemperatureService temperatureService;

	public TemperatureController(TemperatureService temperatureService) {
		this.temperatureService = temperatureService;
	}

	@GetMapping
	public ResponseEntity<AverageTemperature> getAverageTemperature() {
		AverageTemperature temperature = temperatureService.calculateAverageTemperature();
		return ResponseEntity.ok().body(temperature);
	}

}
