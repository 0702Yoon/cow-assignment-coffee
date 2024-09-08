package org.example.domain.client;

import java.util.Scanner;

public class Client {

    private final Scanner scanner;

    public Client() {
        this.scanner = new Scanner(System.in);
    }

    public String input() {
        return scanner.nextLine();
    }

    public int inputInt() {
        return Integer.parseInt(scanner.nextLine());
    }

    public boolean yesOrNo() {
        return switch (input()) {
            case "1", "y", "Y" -> true;
            case "2", "x", "X" -> false;
            default -> {
                System.out.println(
                    "올바르지 않은 값입니다. 1,y,Y 혹은 2,x,X로 입력해주세요.");
                yield yesOrNo(); //
            }
        };
    }
}
