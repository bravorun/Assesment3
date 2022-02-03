package com.ymsli.assesment.jdbc.customer.controller;

import com.ymsli.assesment.jdbc.customer.model.persistance.Customer;
import com.ymsli.assesment.jdbc.customer.model.service.CustomerServiceImplementation;

public class Main {
	public static void main(String args[]) {
		Customer c=null;
		CustomerServiceImplementation cust=new CustomerServiceImplementation();
		c=cust.getCustomerByCustomerId(1);
		System.out.println("Customer details are : ");
		System.out.println(c);
		
		
		
	}

}
