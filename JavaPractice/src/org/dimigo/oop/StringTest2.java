package org.dimigo.oop;

public class StringTest2 {
    public static void main(String[] args) {
        String str = "디미고";
        str += "2학년";
        str += "6반";
        str += "이준형";

        StringBuilder sb = new StringBuilder("디미고");
        sb.append("2학년 ");
        sb.append("6반 ");
        sb.append("이준형");

        System.out.println(sb.toString());
        System.out.println(sb);

        // 속도 비교
        compareSpeed();
    }
    public static void compareSpeed() {
        long start = System.currentTimeMillis();

        String str = "abc";
        StringBuffer sb = new StringBuffer("abc");
        StringBuilder sb2 = new StringBuilder("abc");
        for (int i=0; i<100000; i++)
        {
            sb2.append("def");
            //sb.append("def");
           // str += "def";
        }
        // 반복문

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}