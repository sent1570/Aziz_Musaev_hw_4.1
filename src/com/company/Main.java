package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        List<String> a = listA("a123", "a2345", "a34657", "a575754", "a55555555");
        List<String> b = listB("m1234234", "b2342", "b3234234324", "b42222", "b53");
        System.out.println(a);
        System.out.println(b);
        List<String> c = new ArrayList<>();
        Collections.reverse(b);
        for (int i = 0; i < a.size(); i++) {
            c.add(a.get(i));
            c.add(b.get(i));
        }
        System.out.println(c);
        c.sort(Comparator.comparingInt(String::length));
        System.out.println(c);
    }

    public static ArrayList listA(String a1, String a2, String a3, String a4, String a5) {
        ArrayList<String> listA1 = new ArrayList<>();
        listA1.add(a1);
        listA1.add(a2);
        listA1.add(a3);
        listA1.add(a4);
        listA1.add(a5);
        return listA1;

    }

    public static ArrayList listB(String b1, String b2, String b3, String b4, String b5) {
        ArrayList<String> listB1 = new ArrayList<>();
        listB1.add(b1);
        listB1.add(b2);
        listB1.add(b3);
        listB1.add(b4);
        listB1.add(b5);
        return listB1;
    }

}
