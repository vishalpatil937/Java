package com.xoriant.collections_demo;

import java.util.Comparator;

public class Customer_id_comparator implements Comparator<Customer>{

	@Override
	public int compare(Customer cust1, Customer cust2) {
//		Integer id1=cust1.getCustomer_id();
//		Integer id2=cust2.getCustomer_id();
		String name1=cust1.getCustomerName();
		String name2=cust2.getCustomerName();
		if(name1.compareTo(name2)==0) {
			String add1=cust1.getAddress();
			String add2=cust2.getAddress();
			return add1.compareTo(add2);
		}
		else
			return name1.compareTo(name2);
	}
	
}
