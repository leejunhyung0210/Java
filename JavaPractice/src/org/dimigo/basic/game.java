package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] attackPoint = {100, 100, 100, 100};
        String[] character = {"마법사", "영주", "기사", "농민"};
        int mynumber = 0;
        boolean run = true;
        while (run)
        {
            System.out.println("--------------------");
            System.out.println("<< 게임 메뉴 >>");
            System.out.println("1. 캐릭터 설정");
            System.out.println("2. 공격력 증가");
            System.out.println("3. 공격력 감소");
            System.out.println("9. 종료");
            System.out.println("--------------------");
            System.out.println("메뉴 입력 => ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            switch(choose)
            {
                case 1:
                    mynumber = ran.nextInt(4)+1;
                    System.out.printf("%s(으)로 설정되었습니다.", character[mynumber]);
                    System.out.println();
                    break;
                case 2:
                    if (mynumber == 0) {
                        System.out.println("먼저 캐릭터를 설정하세요!!");
                        break;
                    }
                    else
                {
                    attackPoint[mynumber] = attackPoint[mynumber] + 10;
                    System.out.printf("%s 공격력이 증가되었습니다. 현재 공격력 : %d", character[mynumber], attackPoint[mynumber]);
                    System.out.println();
                    break;
                }
                case 3:
                     if (mynumber == 0) {
                         System.out.println("먼저 캐릭터를 설정하세요!!");
                     }
                     else {
                         attackPoint[mynumber] = attackPoint[mynumber] - 10;
                         System.out.printf("%s 공격력이 감소되었습니다. 현재 공격력 : %d", character[mynumber], attackPoint[mynumber]);
                         System.out.println();
                         break;
                     }
                case 9:
                    System.out.println("이제 공부하세요!"); run = false; break;
                default :
                    System.out.println("없는 메뉴입니다!!"); break;
            }
        }
    }
}
