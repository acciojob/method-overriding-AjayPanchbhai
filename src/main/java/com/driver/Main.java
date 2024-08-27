package com.driver;

public class Main {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.meth());

        a = new B();
        System.out.println(a.meth());
    }
}