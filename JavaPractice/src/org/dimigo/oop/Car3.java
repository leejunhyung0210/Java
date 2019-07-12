//public class Main {
//    public static void main(String[] args) {
//        Car3[] Car3 = new Car3[3];
//
//        Car3[0] = new Car3("현대자동차", "제네시스", "검정색", 225, 50000000);
//        Car3[1] = new Car3("기아자동차", "K7", "흰색", 246);
//        Car3[2] = new Car3("삼성자동차", "SM7", "회색");
//
//        System.out.println("<< 자동차 목록 >>");
//        for (int i = 0; i<3; i++) {
//            System.out.println("제조사명 : " + Car3[i].getCompany());
//            System.out.println("모델명 : " + Car3[i].getModel());
//            System.out.println("색상 : " + Car3[i].getColor());
//            System.out.println("최대속도 : " + Car3[i].getMaxSpeed() + "km");
//            System.out.printf("가격 : %,d원", Car3[i].getPrice());
//            System.out.println();
//            System.out.println();
//        }
//    }
//}
//
//
//class Car3 {
//    private String company;
//    private String model;
//    private String color;
//    private int maxSpeed;
//    private int price;
//
//    public Car3(String company, String model, String color, int maxSpeed, int price) {
//        this.company = company;
//        this.model = model;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//        this.price = price;
//    }
//
//    public Car3(String company, String model, String color, int maxSpeed) {
//        this.company = company;
//        this.model = model;
//        this.color = color;
//        this.maxSpeed = maxSpeed;
//    }
//
//    public Car3(String company, String model, String color) {
//        this.company = company;
//        this.model = model;
//        this.color = color;
//    }
//
//    public String getCompany() {
//        return company;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public int getMaxSpeed() {
//        return maxSpeed;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//
//    public void setCompany(String company) {
//        this.company = company;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setMaxSpeed(int maxSpeed) {
//        this.maxSpeed = maxSpeed;
//    }
//
//    public void setPrice(int price) {
//        this.price = price;
//    }
//
//}
