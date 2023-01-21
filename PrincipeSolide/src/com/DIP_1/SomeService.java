package com.DIP_1;

public class SomeService {
    private Logger logger;

    public SomeService(Logger logger){
        this.logger = logger;
    }

    public void someMethod(){
        this.logger.log("Hi!");
    }
}
