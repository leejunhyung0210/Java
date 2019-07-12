package org.dimigo.Inheritance;

public class AnimalTest {
    public static void main(String[] args) {
        Animal a = new Animal("아무개");
        System.out.println(a);
        a.eat();
        a.sleep();
        a.bark();

        Dog d = new Dog("멍멍이");
        System.out.println(d);
        d.eat();
        d.sleep();
        d.bark();
        d.wag();

        Cat c = new Cat("야옹이");
        System.out.println(c);
        c.eat();
        c.sleep();

        Tiger t = new Tiger("호돌이");
        System.out.println(t);
        t.bark();
        t.hunt();

        Animal[] animals = {
                new Dog("멍멍이"),
                new Cat("야옹이"),
                new Tiger("호돌이")
        };

        for(Animal animal : animals) {
            //System.out.println(animal);
            //animal.bark();
            dobark(animal);
        }

        Animal a2 = new Cat("야옹이");
        a2.eat();
        a2.sleep();
        a2.bark();
        ((Cat) a2).scratch();

        Animal cat = new Dog("멍멍이");
        Animal dog = new Cat("야옹이");

        System.out.println(dog instanceof Dog);
        System.out.println(cat instanceof Cat);
        System.out.println(dog instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Animal);

        dobark(dog);
        dobark(cat);
    }

    private static void dobark(Animal animal) {
        if (animal instanceof Dog) {
            ((Dog) animal).wag();
        }
        else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }
}