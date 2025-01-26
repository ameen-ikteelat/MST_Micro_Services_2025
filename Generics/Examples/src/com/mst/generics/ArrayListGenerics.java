package com.mst.generics;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenerics {
    public static void main(String[] args) {
        /*
        try {
            List list = new ArrayList();
            list.add("Hello MST Students!");
            Integer s = (Integer) list.getFirst();
            System.out.println("S = " + s);
        } catch (ClassCastException e) {
            e.printStackTrace();
        }*/
        List<String> list = new ArrayList<>();
        list.add("Hello #2");
        String s = list.getFirst();
        System.out.println("S = " + s);
        System.out.println("DONE!");
    }
}
