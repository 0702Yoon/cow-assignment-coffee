package org.example.domain.function.order.employee;

import java.util.Arrays;
import org.example.global.SellMenu;
import org.example.domain.function.order.entity.Order;
import org.example.domain.function.order.repo.OrderList;

public class OrderReceiver {

    private final OrderSaver orderSaver;

    public OrderReceiver() {
        this.orderSaver = new OrderSaver();
    }

    public void showMenu() {
        System.out.println("**********제공되는 메뉴입니다.**********");
        Arrays.stream(SellMenu.values())
            .forEach(System.out::println);
        System.out.println("선택하신 메뉴와 개수를 입력해주세요.");
    }

    public void receiveMenu(String clientOrder) {
        Order order = parseOrder(clientOrder);
        orderSaver.saveOrder(order);
    }

    public void askReOrder() {
        System.out.println("더 주문하시겠습니까? 1. Y / 2. N");
    }

    private Order parseOrder(String clientOrder) {
        String[] parts = clientOrder.split(" ");
        if (parts.length != 2) {
            throw new IllegalArgumentException("주문 형식이 다릅니다.");
        }
        return new Order(parts[0], parts[1]);
    }
}
