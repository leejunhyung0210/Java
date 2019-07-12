package org.dimigo.oop;

public class Person {
    //private final String species = "포유류";
    private final String birthdate;
    private String name;
    public static final String SPECIES = "포유류";

    public Person(String birthdate, String name) {
        this.birthdate = birthdate;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
               // "species='" + species + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        Person p1 = new Person("20020101", "아이유");
        Person p2 = new Person("20020101", "김종수");
        System.out.println(p1);
        System.out.println(p2);

        //p1.species = "파충류";
        System.out.println(Person.SPECIES);
    }
}
