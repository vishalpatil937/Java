package com.xoriant.utility;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.xoriant.beans.Customer;
import com.xoriant.beans.OrderItem;
import com.xoriant.beans.PurchaseOrder;
import com.xoriant.beans.StockItem;

public interface PurchaseOrderManager {

	List<Customer> populateCustomers();
	List<StockItem> populateStoreItems ();
	void createOrder(int cust_id,ArrayList<OrderItem> OrderedItems,Date ship_date);
	void storePurchaseOrder();
	void shipOrders(int cust_id);
	Void removeExpiredItems();
	Void showItems();
	Void applyDiscountOnItems ();
	Map<Customer,ArrayList<PurchaseOrder>> getOrdersByCustomer();
	Void displayDiscountedItemsList();
	
	
}
