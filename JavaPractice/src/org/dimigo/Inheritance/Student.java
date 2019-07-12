package org.dimigo.Inheritance;

public class Student extends Person {
    private String studentid;

    public Student(String name, int age, int height, int weight, String studentid) {
        super(name, age, height, weight);
        this.studentid = studentid;
    }

    public void study() {
        System.out.println(super.getName() + "이/가 공부를 합니다.");
    }

    public void rollcall() {
        System.out.println(getName() + "이/가 점호를 한다.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentid='" + studentid + '\'' +
                super.toString();
    }
}
