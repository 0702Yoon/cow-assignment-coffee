package org.example.domain.function.order;

import org.example.domain.function.EmployeeManager;
import org.example.domain.function.order.employee.OrderReceiver;
import org.example.domain.client.Client;

public class OrderEmployeeManager implements EmployeeManager {

    private final OrderReceiver orderReceiver;

    private boolean status = true;

    public OrderEmployeeManager() {
        this.orderReceiver = new OrderReceiver();
    }

    @Override
    public void run(Client client) {
        while (status) {
            orderReceiver.showMenu();
            String clientOrder = client.input();
            orderReceiver.receiveMenu(clientOrder);
            orderReceiver.askReOrder();
            status = client.yesOrNo();
        }
    }
}
