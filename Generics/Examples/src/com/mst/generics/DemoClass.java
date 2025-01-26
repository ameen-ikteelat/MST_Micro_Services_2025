package com.mst.generics;

public class DemoClass {
    public <T> void genericsMethod(T data) {
        System.out.println("This is a generics Method:");
        System.out.println("Data is:" + data);
    }
}
