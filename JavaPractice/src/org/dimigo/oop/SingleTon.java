package org.dimigo.oop;

public class SingleTon {
    private static SingleTon instance = new SingleTon();

    private SingleTon() {}

    public static SingleTon getInstance() {
        return instance;
    }

    public static SingleTon getInstance2() {
        if (instance == null)
        {
            instance = new SingleTon();
        }
        return instance;
    }
}