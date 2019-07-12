package org.dimigo.Inheritance;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }
/**
    public void bark() {
        System.out.println("야옹");
    }
**/
    public void scratch() {
        System.out.println(name + "이/가 할퀸다.");
    }
}
