package com.ctech.complexDataTypes;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public class ConcHashMapExample2 {
	
	static Map<String, AtomicLong> orders = new ConcurrentHashMap<>();
	
	static void processOrders() {
		for(String city : orders.keySet()) {
			for(int i=0;i<50;i++) {
				orders.get(city).getAndIncrement();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		orders.put("Dehradoon", new AtomicLong());
		orders.put("Delhi", new AtomicLong());
		orders.put("Mumbai", new AtomicLong());
		orders.put("Kolkata", new AtomicLong());
		orders.put("Chennai", new AtomicLong());
		
		ExecutorService service = Executors.newFixedThreadPool(2);
		
		service.submit(ConcHashMapExample2::processOrders);
		service.submit(ConcHashMapExample2::processOrders);
		
		
		service.awaitTermination(5, TimeUnit.SECONDS);
		service.shutdown();
		
		System.out.println(orders);
	}
	

}
