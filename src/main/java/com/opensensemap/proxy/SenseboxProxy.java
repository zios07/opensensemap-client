package com.opensensemap.proxy;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SenseboxProxy {
	private String _id;
//	private String name;
	private List<Sensor> sensors;
//	private String exposure;
//	private String createdAt;
//	private String model;
//	private CurrentLocation CurrentLocationObject;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
	public List<Sensor> getSensors() {
		return sensors;
	}

	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}
//
//	public String getExposure() {
//		return exposure;
//	}
//
//	public void setExposure(String exposure) {
//		this.exposure = exposure;
//	}
//
//	public String getCreatedAt() {
//		return createdAt;
//	}
//
//	public void setCreatedAt(String createdAt) {
//		this.createdAt = createdAt;
//	}
//
//	public String getModel() {
//		return model;
//	}
//
//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public CurrentLocation getCurrentLocationObject() {
//		return CurrentLocationObject;
//	}
//
//	public void setCurrentLocationObject(CurrentLocation currentLocationObject) {
//		CurrentLocationObject = currentLocationObject;
//	}

}
