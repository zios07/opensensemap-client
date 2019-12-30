package com.opensensemap.proxy;

import java.util.List;

public class SensorList {
	private String _id;
	private List<Sensor> sensors;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public List<Sensor> getSensors() {
		return sensors;
	}

	public void setSensors(List<Sensor> sensors) {
		this.sensors = sensors;
	}

}