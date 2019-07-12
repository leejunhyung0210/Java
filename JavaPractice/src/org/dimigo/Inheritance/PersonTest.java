package org.dimigo.Inheritance;

public class PersonTest {

    public static void main(String[] args) {
        Person p = new Person("잔나비", 27, 180, 70);
        //System.out.println(p);
        p.sleep();
        p.sleep();

        Student s = new Student("마재연", 18, 170, 65, "2609");
       // System.out.println(s);
        s.eat();
        s.sleep();
        s.study();
        s.rollcall();

        Teacher t = new Teacher("김종수", 48, 180, 70, "화학1");
        //System.out.println(t);;
        t.teach();
        t.doTask();


    }
}