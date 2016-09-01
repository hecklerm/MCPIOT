package org.thehecklers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

/**
 * @author Mark Heckler (mark.heckler@gmail.com, @mkheck)
 */
@Component
@Entity
public class Reading {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private int node;
	private double hum;
	private double temp;
	private double volts;
	private double current;
	private int status;
	
	protected Reading() {}
	
	public Reading(int id, int node, double hum, double temp, double volts, double current, int status) {
		super();
		this.id = id;
		this.node = node;
		this.hum = hum;
		this.temp = temp;
		this.volts = volts;
		this.current = current;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNode() {
		return node;
	}

	public void setNode(int node) {
		this.node = node;
	}

	public double getHum() {
		return hum;
	}

	public void setHum(double hum) {
		this.hum = hum;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getVolts() {
		return volts;
	}

	public void setVolts(double volts) {
		this.volts = volts;
	}

	public double getCurrent() {
		return current;
	}

	public void setCurrent(double current) {
		this.current = current;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public void setReading(Reading reading) {
        this.id = reading.getId();
        this.node = reading.getNode();
        this.hum = reading.getHum();
        this.temp = reading.getTemp();
        this.volts = reading.getVolts();
        this.current = reading.getCurrent();
        this.status = reading.getStatus();
    }

	@Override
	public String toString() {
		return "Reading [id=" + id + ", node=" + node + ", hum=" + hum + ", temp=" + temp + ", volts=" + volts
				+ ", current=" + current + ", status=" + status + "]";
	}
}
