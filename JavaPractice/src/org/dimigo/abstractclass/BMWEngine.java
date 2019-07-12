package org.dimigo.abstractclass;

public class BMWEngine extends Engine {
    @Override
    public void startEngine() {
        System.out.println("BMW 엔진 가동");
    }

    @Override
    public void stopEngine() {
        System.out.printf("BMW 엔진 멈춤");
    }
}
