package org.dimigo.Practice10;

public class Chinese extends Person {
    public Chinese(String name) {
        super(name);
    }

    public void sayHello() {
        System.out.println("니하오");
    }

    public void sayBye() {
        System.out.println("짜이찌엔");
    }

    public String toString() {
        return "저는 중국사람 " + name + " 입니다.";
    }
}