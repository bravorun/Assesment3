package com.ymsli.assesment.jdbc.customer.model.service;

import com.ymsli.assesment.jdbc.customer.model.persistance.Customer;
import com.ymsli.assesment.jdbc.customer.model.persistance.CustomerDaoImplementation;

public class CustomerServiceImplementation implements CustomerService {
	private CustomerDaoImplementation customer;
	public CustomerServiceImplementation() {
		this.customer=new CustomerDaoImplementation();
	}
	@Override
	public Customer getCustomerByCustomerId(int custId) {
		return customer.getCustomerByCustomerId(custId);
	}

}
