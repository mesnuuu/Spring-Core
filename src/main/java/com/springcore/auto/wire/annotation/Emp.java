package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {

	private Address address;

	public Emp() {
		// TODO Auto-generated constructor stub
	}

	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("Autowired to Constructor");
	}

	public Address getAddress() {
		return address;
	}

	@Autowired
	@Qualifier("address2")
	public void setAddress(Address address) {
		System.out.println("Autowired to setter");
		this.address = address;
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

}
