package org.dimigo.oop;

public class ArrayBasic {
    public static void main(String[] args) {
        // 기본형 타입 배열
        // int, long, boolean, char, float, double, short, byte
        int[] intArr = new int[5];
        printArray(intArr);

        // double 타입 5개짜리 배열 생성 후 출력
        double[] doubleArr = new double[5];
        printArray(doubleArr);
        int[] intArr2 = new int[]{1, 2, 3, 4, 5}; // new int[]는 안 써도 됨
        printArray(intArr2);

        // 참조형 타입 배열
        String[] strArr = new String[3];
        printArray(strArr);

        strArr[0] = "치킨";
        strArr[1] = "족발";
        strArr[2] = "짜장면";
        printArray(strArr);

        String[] strArr2 = {"트와이스", "블랙핑크", "씨잼"};
        printArray(strArr2);

        //Book 타입 배열 2개까지 출력
        //Book 객체 생성 후 출력
        Book[] bookArr = new Book[2];
        bookArr[0] = new Book("수학의 바이블", "김재영", 100);
        bookArr[1] = new Book("워드마스터", "전유원", 200);

        printArray(bookArr);

        Book[] bookArr2 = new Book[] {new Book("수학의 바이블", "김재영", 100), new Book("워드마스터", "전유원", 200)}; // new Book[] 은 선택
        printArray(bookArr2);

        int[] intArr3 = new int[3];
        System.out.println(intArr3.length);
        System.out.println(intArr3.length-1);

        String[] strArr3 = new String[3];
        System.out.println(strArr3[0].length());

        Book[] bookArr3 = new Book[3];
        System.out.println(bookArr3[0].getTitle());

        String[] strArr4 = null;

        strArr4 = new String[] {"테스트1", "테스트2", "테스트3"};

    }

    private static void printArray(Book[] bookArr) {
        for (Book value : bookArr) {
        System.out.println(value);
//            System.out.printf("책 제목: %s, 저자명: %s, 페이지수:%d\n",
//                    value.getTitle(), value.getAuthor(), value.getPage());
//
        }
        System.out.println();
    }

    private static void printArray(String[] strArr) {
        for (String value : strArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(double[] doubleArr) {
        for (double value : doubleArr) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }

    private static void printArray(int[] intArr) {
        // intArray 배열 요소값 출력
//        for (int i=0; i<intArr.length; i++) {
//            System.out.print(intArr[i] + " | ");
//        }
        for (int value : intArr) {
            System.out.print(value + " | ");
        }
        System.out.println();

    }
}
