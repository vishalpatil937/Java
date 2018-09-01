package com.xoriant.collections_demo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Customer {
	private int customer_id;
	private String customerName;
	private String address;
	public Customer(int customer_id, String customerName, String address) {
		this.customer_id = customer_id;
		this.customerName = customerName;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", customerName=" + customerName + ", address=" + address + "]";
	}
	
	
	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public static void main(String[] args) {
		Customer cus=new Customer(123,"Cust1","Address1");
		Customer cus1=new Customer(13,"Cust1","Address3");
		Customer cus2=new Customer(1203,"Cust1","Address1");
		Set<Customer> cust=new HashSet<>();
		cust.add(cus);
		cust.add(cus1);
		cust.add(cus2);
//		System.out.println(cust+":"+cust.size());
		
		cust=new TreeSet<>(new Customer_id_comparator());
		cust.add(cus);
		cust.add(cus1);
		cust.add(cus2);
		System.out.println(cust);
		
		Map<Integer, Customer> map=new HashMap<>();
		map.put(1234, cus);
		System.out.println("map:"+map);
		Customer ret=map.get(1234);
		System.out.println(ret.address);
		
	}
}