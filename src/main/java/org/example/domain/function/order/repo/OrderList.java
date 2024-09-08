package org.example.domain.function.order.repo;

import java.util.HashMap;
import java.util.Map;
import org.example.domain.function.order.entity.Order;

public class OrderList {

    private final Map<Long, Order> orderList;
    private Long orderNumber;

    public OrderList() {
        orderList = new HashMap<>();
        orderNumber = 1L;
    }

    public void saveOrder(Order clientOrder) {
        orderList.put(orderNumber, clientOrder);
        orderNumber += 1L;
    }
}
