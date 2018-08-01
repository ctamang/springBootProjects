package com.ctech.complexDataTypes;

import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapExample {

	public static void main(String[] args) {
	Map<Order,Integer> orders = new WeakHashMap<>();
	
	//weak reference
	orders.put(new Order(1, "fdasfsdafsad"), 100);
	orders.put(new Order(2, "bcvxbcvb"), 100);
	
	//strong reference
	Order o3 = new Order(3, "rewrewewtretrt");
	orders.put(o3, 200);
	
	System.out.println(orders.size());
	
	System.gc();
	
	System.out.println(orders.size());
	
	}
}

class Order{
	int orderId;
	String details;
	
	public Order(int id, String orderDetails) {
		orderId = id;
		details = orderDetails;
	}
}
