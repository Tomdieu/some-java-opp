package com.activty;

public class TestDivision {
    public static void main(String[] args){
        System.out.println("Method division de classe:");
        System.out.println("21/3 = "+Division.diviser());

        System.out.println("Method division de la classe:");
        Division D = new Division(0,0);
        System.out.println("21/3 = "+D.diviser(21,3));

    }
}
