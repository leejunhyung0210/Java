package org.dimigo.oop;

public class MultiArray {
    public static void main(String[] args) {
        int[][] intArr = new int[2][3];
        printArray(intArr);

        intArr[0][2] = 100;
        intArr[1][1] = 100;

        // String 타입

        String[][] strArr = {
                {"C", "C++", "Java"},
                {"C#", "Java"}
        };
        String[][] strArr2 = new String[][] {
                new String[] {"C", "C++", "Java"},
                new String[] {"C#", "PHP"}
        };

//        String[][] strArr = new String[2][];
//        strArr[0] = new String[] {"C", "C++", "Java"};
//        strArr[1] = new String[] {"C#", "PHP"};

        printArray(strArr);
    }

    private static void printArray (int[][] intArr) {
        for (int[] arr : intArr) {
            for(int value : arr) {
                System.out.printf(value + " | ");
            }
            System.out.println();
        }
    }

    private static void printArray (String[][] intArr) {
        for (String[] arr : intArr) {
            for(String value : arr) {
                System.out.printf(value + " | ");
            }
            System.out.println();
        }
    }
}