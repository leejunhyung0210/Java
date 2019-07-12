package org.dimigo.basic;

public class PrimitiveDataType {

    static boolean flag; //static이 있는 변수는 다른 static 함수에서 공유함(전역변수)

    //boolean 자료형에서 선언을 안 하면 False로 초기화 된다는 건 전역변수로 선언했을 때에만 해당한다.
    //지역변수로 boolean을 선언한다면 초기화를 해야 문법에 어긋나지 않는다.

    public static void main(String[] args) {

        //1. 논리형


        //flag가 참이면 "참입니다!" 출력
        //flag가 거짓이면 "거짓입니다!" 출력

        if(flag) {
            System.out.println("참입니다!");
        }
        else {
            System.out.println("거짓입니다!");
        }

        // 삼항연산자로 작성
        System.out.println(flag ? "참입니다!" : "거짓입니다!");


        //2-1. 문자형
        char c1 = 'A'; //유니코드는 ''로 둘러싸서 값을 표현한다.
        char c2 = 65;
        char c3 = '\u0041'; // 16진수임. 10진수로 65(A의 코드)

        System.out.printf("%c, %c, %c\n", c1, c2, c3);
        System.out.println('뷁');
        // Default Value는 '\u0000' (space와 같음)이다. 16진수로 표현한다.

        //2-2. 문자열
        String name = "정준영";
        System.out.println("My name is " + name);


        //3. 정수형
        int i1 = 10;
        int i2 = 0b00001010; // 앞에 0b가 붙으면 2진수이고, 8자리 수로 표현한다.
        int i3 = 012; //앞에 0만 붙이면 8진수이다.
        int i4 = 0x0A; //0x가 붙으면 16진수이다.

        System.out.printf("%d, %d, %d, %d\n", i1, i2, i3, i4);

        //byte 타입 (-128 ~ 127)
        byte b1 = -128; //최소값
        byte b2 = 127; //최대값

        b1--;
        b2++;

        //최소보다 내려가거나 최대보다 커진다면 한 바퀴 돌아 128부터 작아지거나 -127부터 커진다
        System.out.println(b1);
        System.out.println(b2);

        //자료형별 범위
        System.out.println(Byte.MIN_VALUE + "~" + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + "~" + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + "~" + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + "~" + Long.MAX_VALUE);

        // 문제 : 100억을 저장하려면 ( 0이 10개 )
        long l = 10000000000L; //특)100억임

        float f1 = 3.14f;
        double d1 = 3.14;
        System.out.printf("%f, %f\n", f1, d1);

        // 실수 정밀도 테스트
        float f2 = 0.1234567890f;
        double d2 = 0.12345678901234567890;

        System.out.println(f2);
        System.out.println("d2");
    }

}
