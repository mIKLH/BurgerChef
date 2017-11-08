package com.burgerchef.test.util;

import org.junit.Assert;

import com.burgerchef.domain.Order;

public class OrderTestUtils {

	public static void assertAllButIdsMatchBetweenOrders(Order expected, Order actual) {
    	Assert.assertEquals(expected.getDescription(), actual.getDescription());
    	Assert.assertEquals(expected.getCostInCents(), actual.getCostInCents());
    	Assert.assertEquals(expected.isComplete(), actual.isComplete());
    }
	
    public static Order generateTestOrder() {
    	Order order = new Order();
    	order.setDescription("test description");
    	order.setCostInCents(150L);
    	order.markIncomplete();
    	return order;
    }
    
     public static Order generateUpdatedOrder(Order original) {
    	Order updated = new Order();
    	updated.setDescription(original.getDescription() + " updated");
    	updated.setCostInCents(original.getCostInCents() + 100);
    	updated.markComplete();
    	return updated;
    }
}
