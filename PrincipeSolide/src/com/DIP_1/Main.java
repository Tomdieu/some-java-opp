package com.DIP_1;

public class Main {
    public static void main(String[] args) {
        SomeService service = new SomeService(new ConsoleLogger());

        service.someMethod();
    }
}
