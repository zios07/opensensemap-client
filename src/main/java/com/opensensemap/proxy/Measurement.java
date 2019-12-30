package com.opensensemap.proxy;

import java.util.Date;

public class Measurement {
	private String value;
	private Date createdAt;
	private String id;

	public Measurement() {
	}

	public Measurement(String id) {
		this.id = id;
	}

	public Measurement(String value, Date createdAt) {
		this.value = value;
		this.createdAt = createdAt;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "LastMeasurement [value=" + value + ", createdAt=" + createdAt + "]";
	}
}