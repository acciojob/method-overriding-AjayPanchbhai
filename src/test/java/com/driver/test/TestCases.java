package com.driver.test;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.meth());

        a = new B();
        System.out.println(a.meth());
    }
}
