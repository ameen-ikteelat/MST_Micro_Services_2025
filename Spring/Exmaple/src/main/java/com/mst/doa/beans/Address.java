package com.mst.doa.beans;

import java.io.Serializable;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="address")
public class Address implements Serializable {
	
	@EmbeddedId()
	private AddressPK city; 
	
	private String State; 
	
	private String Country;

	public AddressPK getPk() {
		return city;
	}

	public void setPk(AddressPK pk) {
		this.city = pk;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}

	@Override
	public String toString() {
		return "Address [pk=" + city + ", State=" + State + ", Country=" + Country + "]";
	}
	
	
}
