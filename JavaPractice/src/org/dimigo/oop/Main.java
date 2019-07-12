package org.dimigo.oop;

public class Main {
    public static void main(String[] args) {
        int TotalPrice=0;
        Snack[] snack = new Snack[3];
        snack[0] = new Snack("새우깡", "농심", 1100, 2);
        snack[1] = new Snack("콘칲", "크라운", 1200, 1);
        snack[2] = new Snack("허니버터칩", "해태", 1500, 4);

        for (int i=0; i<3; i++) {
            System.out.println(snack[i].toString());
            TotalPrice = TotalPrice + snack[i].calcPrice();
        }
        System.out.printf("총 구매 금액 : %,d원", TotalPrice);
    }

}

class Snack {
    private String name;
    private String company;
    private int price;
    private int number;

    public Snack(String name, String company, int price, int number)
    {
        this.name = name;
        this.company = company;
        this.price = price;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int calcPrice() {
        return price*number;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
            sb.append("이름 : " + this.getName() + "\n");
            sb.append("제조사 : " + this.getCompany() + "\n");
            sb.append("가격 : ").append(String.format("%,d원", price)).append("\n");
            sb.append("개수 : ").append(String.format("%d개", number)).append("\n");
        return sb.toString();
    }

}
