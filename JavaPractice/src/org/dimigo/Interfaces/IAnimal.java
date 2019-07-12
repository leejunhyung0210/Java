package org.dimigo.Interfaces;

public interface IAnimal {
    public static final String FARM_NAME = "디미 동물농장";
    String FARM_NAME2 = "디미 동물농장";
   // public abstract void eat();
   // abstract void sleep();
    void bark();

    default void eat() {
        System.out.println("냠냠");
    }

    default void sleep() {
        System.out.println("쿨쿨");
    }

    public static void welcome() {
        System.out.printf(FARM_NAME + "에 오신걸 환영합니다");
    }
}
