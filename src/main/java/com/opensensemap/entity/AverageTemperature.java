package com.opensensemap.entity;

public class AverageTemperature {

	private double avg;

	private String gadget;

	public AverageTemperature() {

	}

	public AverageTemperature(double avg, String gadget) {
		super();
		this.avg = avg;
		this.gadget = gadget;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGadget() {
		return gadget;
	}

	public void setGadget(String gadget) {
		this.gadget = gadget;
	}

}
