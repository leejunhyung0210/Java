package org.dimigo.oop;

public class Calculator2 {

    private static boolean powerflag;
    public static double Pi = 3.141592;
    public void powerOn() {
        if (!powerflag) {
            System.out.println("전원을 켭니다");
            powerflag = true;
        }
    }
    public void powerOff() {
        if (powerflag) {
            System.out.println("전원을 끕니다");
            powerflag = false;
        }
    }


    public static int add(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 + num2;
    }
    public static int sub(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 - num2;
    }
    public static int mul(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return num1 * num2;
    }

    public static double div(int num1, int num2, Calculator2 c) {
        c.powerOn();
        return (double)num1 / num2;
    }
}
