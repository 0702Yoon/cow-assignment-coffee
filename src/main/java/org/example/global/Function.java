package org.example.global;

import org.example.domain.function.EmployeeManager;
import org.example.domain.function.cancel.CancelEmployeeManager;
import org.example.domain.function.order.OrderEmployeeManager;
import org.example.domain.function.pay.PayEmployeeManager;

public enum Function {
    ORDER(1, new OrderEmployeeManager(), "주문하기"), PAY(2, new PayEmployeeManager(), "결제하기"),
    CANCEL(3, new CancelEmployeeManager(), "취소하기"), EXIT(4, null, "종료하기");
    private final int order;
    private final EmployeeManager employeeManager;

    private final String name;

    Function(int order, EmployeeManager employeeManager, String name) {
        this.order = order;
        this.employeeManager = employeeManager;
        this.name = name;
    }

    public static EmployeeManager getEmployeeManager(int selectActionOrder) {
        for (Function function : Function.values()) {
            if (function.getOrder() == selectActionOrder) {
                return function.employeeManager;
            }
        }
        throw new IllegalArgumentException("없는 행동 번호입니다.: " + selectActionOrder);
    }

    public int getOrder() {
        return order;
    }

    @Override
    public String toString() {
        return this.order + "번 : " + this.name;
    }
}
