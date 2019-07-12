package org.dimigo.Inheritance;

public class Animal {
    public String name;

    public Animal(String name) {
        this.name = name;
    }


    public void eat() {
        System.out.println("냠냠냠");
   }

   public void sleep() {
       System.out.println("낄낄");
   }

   public final void bark() {
       System.out.println("멍멍");
   }

   public String toString() {
        return "제 이름은 " + name + "입니다.";
   }
}
