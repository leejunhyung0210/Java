package org.dimigo.oop;

public class ParanArray {
    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        add(intArr, 10);
        printArray(intArr);
        String[] names = {"홍길동", "홍길서", "홍길남", "홍길북"};
        changeName(names);
        printArray(names);
    }
    private static void printArray(int[] intArr)
    {
        for (int a : intArr) {

        }

    }
    private static void printArray(String[] names)
    {
        for(String name : names)
        {
            System.out.println(name);
        }
    }
    private static void changeName(String[] names)
    {
        for (int i=0; i<names.length; i++)
        {
            names[i] = names[i].replaceFirst("홍", "김");

        }
    }
    private static void add(int[] intArr, int num)
    {
        for (int i=0; i<intArr.length; i++)
        {
            intArr[i] += num;
        }
    }
}