package org.dimigo.oop;

public class WrapperTest {
    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.SIZE);
        System.out.println(Integer.toBinaryString(10));
        System.out.println(Integer.toHexString(10));
        System.out.println(Integer.toOctalString(10));

        Integer i1 = new Integer(100);
        Integer i2 = new Integer("100");

        System.out.println(i1 == i2);
        System.out.println(i1.equals(i2));

        Integer i3 = Integer.valueOf(200);
        Integer i4 = Integer.valueOf("200");
        Double d1 = Double.valueOf(3.14);

        int r1 = i1.intValue();
        double r2 = i2.doubleValue();

        int r3 = Integer.parseInt("300");
        double r4 = Double.parseDouble("3.14");

        //100 + 200 = 300

        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[0]+args[1]);

        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d\n", n1, n2, n1 + n2);

        Integer obj1 = new Integer(1000);
        Integer obj2 = new Integer(2000);
        System.out.println(obj1 + obj2);

        Integer a = 1000;
        int b = a + 100;

        Integer c = 10;
        Integer d = c + 20;
        Integer result = c + d;
    }
}
