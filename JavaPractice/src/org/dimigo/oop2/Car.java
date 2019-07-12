package org.dimigo.oop2;

public class Car {
    // 정적 필드
    private static String company;
    // 인스턴트 필드
    private String name;

    public Car(String name) {
        System.out.println("Constructor 호출");
        this.name = name;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Car.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return company = "" + "" + name;
    }
}
