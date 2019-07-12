package org.dimigo.collection;

import org.dimigo.Inheritance.Dog;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("사과");
        list.add("배");
        list.add("딸기");
        list.add("딸기");
        list.add(1, "포도");
        printlist(list);

        list.set(2, "바나나");
        printlist(list);

        System.out.println(list.get(0));
        System.out.println(list.get(list.size() - 1));

        list.remove(0);
        printlist(list);

        list.remove("딸기");

        String s = (String)list.get(0);
    }

    private static void printlist(List<String> list) {
        for(String value : list) {
            System.out.print(value + " | ");
        }
        System.out.println();
    }
}
