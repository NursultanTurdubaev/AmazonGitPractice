package com.digital_nomads.javaFall2021.exceptions;

public class Exceptions {
    public static void main(String[] args) {
        int a[] = new int [3];
        try {
            System.out.println(a[4]);
        }catch (Exception e){
            System.out.println("Something went wrong");
        }
        System.out.println("Hello World");
    }
}
