package com.ctech.complexDataTypes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcHashMapExample {
	
	static Map<String, Long> orders = new ConcurrentHashMap<>();
	
	static void processOrders() {
		for(String city : orders.keySet()) {
			for(int i=0;i<50;i++) {
				Long oldOrder = orders.get(city);
				orders.put(city, oldOrder+1);
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		orders.put("Dehradoon", 0l);
		orders.put("Delhi", 0l);
		orders.put("Mumbai", 0l);
		orders.put("Kolkata", 0l);
		orders.put("Chennai", 0l);
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(ConcHashMapExample::processOrders);
		service.submit(ConcHashMapExample::processOrders);
		
		
		service.awaitTermination(3, TimeUnit.SECONDS);
		service.shutdown();
		
		System.out.println(orders);
	}
	

}
