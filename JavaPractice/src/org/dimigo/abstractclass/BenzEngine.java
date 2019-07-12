package org.dimigo.abstractclass;

public class BenzEngine extends Engine {
    @Override
    public void startEngine() {
        System.out.println("Benz 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.printf("Benz 엔진 멈춤");
    }
}
