package org.example.domain.function.order.employee;

import org.example.domain.function.order.entity.Order;
import org.example.domain.function.order.repo.OrderList;

public class OrderSaver {

    private final OrderList orderList;

    public OrderSaver() {
        orderList = new OrderList();
    }

    public void saveOrder(Order order) {
        orderList.saveOrder(order);
    }

}
