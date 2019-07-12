package org.dimigo.Practice10;

public class Person {
    public String name;

    public Person(String name)
    {
        this.name = name;
    }
    public String getName() { return name; }

    public void setName(String name) {

    }

    public void sayHello() {
        System.out.println("Hello");
    }

    public void sayBye() {
        System.out.println("Bye");
    }

    public String toString() {
        return "저는 " + getName() + " 입니다.";
    }
}
