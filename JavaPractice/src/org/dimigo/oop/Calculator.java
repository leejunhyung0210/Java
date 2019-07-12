package org.dimigo.oop;

public class Calculator {
    // 인스턴스 필드
    private int num1;
    private int num2;
    private boolean powerflag;
    public Calculator() {

    }

    public Calculator(int num1, int num2) {
        this.num1 = this.num1;
        this.num2 = this.num2;
    }

    public void powerOn() {
        if (!this.powerflag) {
            System.out.println("전원을 켭니다");
            this.powerflag = true;
        }
    }
    public void powerOff() {
        if (this.powerflag) {
            System.out.println("전원을 끕니다");
            this.powerflag = false;
        }
    }
    public int add() {
        this.powerOn();
        return this.num1 + this.num2; 
    }
    public int sub() {
        this.powerOn();
        return this.num1 - this.num2;
    }
    public int mul() {
        this.powerOn();
        return this.num1 * this.num2;
    }

    public double div() {
        this.powerOn();
        return (double)this.num1 / this.num2;
    }
}
