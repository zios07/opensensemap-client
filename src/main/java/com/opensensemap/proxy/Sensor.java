package com.opensensemap.proxy;

public class Sensor {
	private String _id;
	private float __v;
	private String boxes_id;
	private Measurement lastMeasurement;
	private String sensorType;
	private String title;
	private String unit;

	public String get_id() {
		return _id;
	}

	public void set_id(String _id) {
		this._id = _id;
	}

	public float get__v() {
		return __v;
	}

	public void set__v(float __v) {
		this.__v = __v;
	}

	public String getBoxes_id() {
		return boxes_id;
	}

	public void setBoxes_id(String boxes_id) {
		this.boxes_id = boxes_id;
	}

	public Measurement getLastMeasurement() {
		return lastMeasurement;
	}

	public void setLastMeasurement(Measurement lastMeasurement) {
		this.lastMeasurement = lastMeasurement;
	}

	public String getSensorType() {
		return sensorType;
	}

	public void setSensorType(String sensorType) {
		this.sensorType = sensorType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}
