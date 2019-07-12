package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        //if문
        //선거권 연령 : 만 19세

        int age = 17;

        //나이가 19세 이상이면 "투표하러 가세요"
        //else "선거권이 없네요"

        if (age >= 19) {
            System.out.println("투표하러 가세요!");
        } else {
            System.out.println("선거권이 없네요");
        }


        // switch문
        // 주사위 랜덤 뽑기(1 - 6)

        int num = new Random().nextInt(6) + 1;
        System.out.println(num);

        switch (num % 2) {
            case 0:
                System.out.println("짝수입니다!");
                break;
            case 1:
                System.out.println("홀수입니다!");
                break;
            default:
                System.out.println("넌 누구냐!");
                break;
        }

        String menu = "냉면";
        switch (menu) {
            case "냉면":
                System.out.println("냉면 선택");
                break;
            case "라면":
                System.out.println("라면 선택");
                break;
            default:
                System.out.println("다이어트 중");
        }

        //for문
        //구구단 출력

        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\t", i, j, i * j);
                System.out.println();

            }
        }

        //for-each문
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        for (int data : arr) {
            System.out.println(data + " ");
        }

        // 빅뱅 멤버 출력
        String[] members = {"TOP", "태양", "GD", "대성", "승리"};
        for (String a : members) {
            System.out.printf("%s", a + " ");
        }
        System.out.println();

        // do while
        // 메뉴 처리

        Scanner scanner = new Scanner(System.in);
        int menun = 0;

        do {
            System.out.println("<<아이돌 선택>>");
            System.out.println("1. 트와이스");
            System.out.println("2. 블랙핑크");
            System.out.println("3. 아이즈원");
            System.out.println("9. 종료");
            System.out.printf("메뉴 선택 : ");

            menun = scanner.nextInt();
            switch (menun) {
                case 1:
                    System.out.println("트와이스를 선택하셨습니다");
                    break;
                case 2:
                    System.out.println("블랙핑크를 선택하셨습니다");
                    break;
                case 3:
                    System.out.println("아이즈원를 선택하셨습니다");
                    break;
                case 9:
                    System.out.println("안녕히 가세요");
                    break;
                default:
                    System.out.println("없는 메뉴입니다");
                    break;
            }

        } while (menun != 9);
    }
}