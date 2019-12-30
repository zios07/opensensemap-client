package com.opensensemap.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.opensensemap.client.OpensensemapAPIClient;
import com.opensensemap.entity.AverageTemperature;
import com.opensensemap.proxy.Measurement;

@Service
public class TemperatureService {

	private OpensensemapAPIClient client;

	public TemperatureService(OpensensemapAPIClient client) {
		this.client = client;
	}

	public AverageTemperature calculateAverageTemperature() {
		AverageTemperature avgTemp = new AverageTemperature();
		List<Measurement> measurements = client.getMeasurements();

		Double avg = measurements.stream().map(m -> m.getValue()).collect(Collectors.averagingDouble(Double::valueOf));
		String gadget;

		if (avg < 10) {
			gadget = "umbrella";
		} else if (avg > 10 && avg < 15) {
			gadget = "raincoat";
		} else {
			gadget = "sunglass";
		}

		avgTemp.setGadget(gadget);
		avgTemp.setAvg(avg);
		return avgTemp;
	}

}
