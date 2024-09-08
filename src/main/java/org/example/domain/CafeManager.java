package org.example.domain;

import java.util.Arrays;
import org.example.domain.function.EmployeeManager;
import org.example.global.Function;
import org.example.domain.client.Client;

public class CafeManager {

    private boolean isTalking;

    public CafeManager() {
        isTalking = false;
    }

    public void startTalking() {
        System.out.println("카페에 오신 것을 환영합니다. 어떤 작업을 하시겠습니까?");
        isTalking = true;
    }

    public void finishTalking() {
        System.out.println("대화 종료하겠습니다!");
    }

    public boolean isTalking() {
        return isTalking;
    }

    public void introduceFunction() {
        System.out.println("☆★☆★ Talking CafeManager ☆★☆★");
        Arrays.stream(Function.values())
            .forEach(System.out::println);
        System.out.println("원하시는 작업 번호를 선택해주세요.");
    }


    public void doFunction(Client client) {
        int selectActionOrder = client.inputInt();
        EmployeeManager employeeManager = Function.getEmployeeManager(selectActionOrder);
        employeeManager.run(client);
    }

    public void askReAction(Client client) {
        System.out.println("작업을 더 하시겠습니까? 1.Y / 2.N");
        isTalking = client.yesOrNo();
    }
}
