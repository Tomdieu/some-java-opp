package com.FooBar;

public class Main {
    public static void main(String[] args) {
        A a = new A(new C1());
        a.bar();
        a.foo();
        a.setC(new C2());
        a.bar();
        a.foo();
        a.setC(new C3());
        a.foo();
        a.bar();
    }
}
