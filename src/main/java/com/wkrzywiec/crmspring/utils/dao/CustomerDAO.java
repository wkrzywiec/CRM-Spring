package com.wkrzywiec.crmspring.utils.dao;

import java.util.List;

import com.wkrzywiec.crmspring.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(int id);

	public List<Customer> searchCustomer(String searchName);
}
