package org.dimigo.basic;

import java.util.Random;

public class Condition {
    public static void main(String[] args) {
        // if문
        // 선거권 연령 : 만 19세
        /**
        int age = 17;

        // 나이가 19세 이상이면 "선거하러 가세요!!!", 그렇지 않으면 "선거권이 없네요"
        if (age >= 19)
            System.out.println("선거하러 가세요!!!");
        else
            System.out.printf("선거권이 없네요");
         **/
        /**
        // switch 문
        // 주사위 랜덤 값 뽑기 (0 ~ 5) nextint bound에는 +1 의 값을 써 줘야됨

        int num = new Random().nextInt(7);
        System.out.println(num);

        // num이 짝수면 짝수입니다, 홀수면 홀수입니다 출력

        switch(num%2)
        {
            case 0 :
                System.out.println("짝수입니다"); break;
            case 1 :
                System.out.println("홀수입니다"); break;
            default :
                System.out.println("오류입니다"); break;
        }
        String menu = "냉면";
        switch (menu) {
            case "냉면" :
                System.out.println("냉면 선택"); break;
            case "라면" :
                System.out.println("라면 선택"); break;
            case "아라코" :
                System.out.println("급식 선택"); break;
            default :
                System.out.println("에러"); break;
        }
         **/
    }
}
