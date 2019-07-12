package org.dimigo.Practice10;

public class PersonTest2 {
    public static void main(String[] args) {
        Person[] Person = {
                new Person("Tom"),
                new Korean("홍길동"),
                new Japanese("다나카"),
                new Chinese("왕밍")
        };

        for (Person person : Person) {
            greeting(person);
            System.out.println();
        }
    }

    private static void greeting(Person person) {
        System.out.println(person.toString());
        person.sayHello();
        person.sayBye();
    }
}
