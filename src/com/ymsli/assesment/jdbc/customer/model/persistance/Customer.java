package com.ymsli.assesment.jdbc.customer.model.persistance;

import java.sql.Date;

public class Customer {
	private int id;
	private String name;
	private String address;
	private String phoneNo;
	private Date dob;
	public Customer(int id, String name, String address, String phoneNo, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.dob = dob;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Customer [id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
		builder.append(", address=");
		builder.append(address);
		builder.append(", phoneNo=");
		builder.append(phoneNo);
		builder.append(", dob=");
		builder.append(dob);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
