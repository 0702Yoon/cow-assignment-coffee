package org.example.application;

import org.example.domain.CafeManager;
import org.example.domain.client.Client;

public class CafeApplication implements Runnable {

    private final CafeManager cafeManager;
    private Client client;

    public CafeApplication() {
        this.cafeManager = new CafeManager();
    }

    @Override
    public void run() {
        client = new Client();
        cafeManager.startTalking();
        while (cafeManager.isTalking()) {
            cafeManager.introduceFunction();
            cafeManager.doFunction(client);
            cafeManager.askReAction(client);
            // cafeManger가 client를 계속 가지고 있는 것이 아닌, 어떠한 행동, 처리를 할때 처리할 사람을 받고 싶어서 이랬음.
        }
        cafeManager.finishTalking();
    }
}
