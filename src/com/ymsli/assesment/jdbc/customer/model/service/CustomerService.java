package com.ymsli.assesment.jdbc.customer.model.service;


import com.ymsli.assesment.jdbc.customer.model.persistance.Customer;

public interface CustomerService {
	public Customer getCustomerByCustomerId(int custId);
	
}
