package org.dimigo.Interfaces;

public interface IEngine {
    void startEngine();
    void stopEngine();
    void setEngine();

    default void start() {
        System.out.printf(" 엔진 가동");
    }

    default void stop() {
        System.out.println(" 엔진 멈춤");
    }
}
