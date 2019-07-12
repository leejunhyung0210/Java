package org.dimigo.oop;

import java.util.Random;
import java.util.Scanner;

public class MyFavorite {
    public static void main(String[] args) {
        Random ran = new Random();
        boolean run = true;
        int randomchoose = 0;
        //int numberchoose = 0;
        String[] questions = {"가장 좋아하는 가수는? ", "가장 좋아하는 배우는? ", "가장 좋아하는 과목은? "};
        String[] answers = {"아이유", "원빈", "자료구조"};
        while(run) {
            System.out.printf("------------------\n" + "1. 질문 선택\n" + "2. 정답 공개\n" + "9. 프로그램 종료\n" + "------------------\n" + "메뉴 선택 => ");

            Scanner scanner = new Scanner(System.in);
            int numberchoose = scanner.nextInt();
            switch(numberchoose)
            {
                case 1:
                    randomchoose = ran.nextInt(3);
                    System.out.printf(questions[randomchoose]);
                    String answer = scanner.next();
                    if (answers[randomchoose].equalsIgnoreCase(answer))
                        System.out.println("정답입니다!");
                    else
                        System.out.println("틀렸습니다!");
                    break;
                case 2:
                    for (int i=0; i<3; i++) {
                        StringBuilder sb = new StringBuilder(questions[i]);
                        sb.append(answers[i] + "입니다.");
                        System.out.println(sb);
                    }
                    break;
                case 9:
                    System.out.println("Bye~");
                    run = false;
                    break;
                default :
                    System.out.println("없는 메뉴입니다.");
                    break;
            }
        }
    }
}
