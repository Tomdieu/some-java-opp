package com.FooBar;

public class A {
    private C c;

    public A(C c) {
        this.c = c;
    }

    public void bar() {
        this.c.subBar();
    }

    public void foo() {
        this.c.subFoo();
    }

    public C getC() {
        return c;
    }

    public void setC(C c) {
        this.c = c;
    }
}
