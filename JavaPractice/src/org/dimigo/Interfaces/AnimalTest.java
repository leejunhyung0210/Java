package org.dimigo.Interfaces;

public class AnimalTest {
    public static void main(String[] args) {
       // IAnimal.FARM_NAME = "디문 동물농장";

        IAnimal.welcome();
        IAnimal[] animals = {
                new Dog(), new Cat()
        };

        for (IAnimal a : animals) {
            a.eat();
            a.sleep();
            a.bark();
        }
    }
}
