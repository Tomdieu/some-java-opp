package com.LSP_3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,4);

        System.out.println("Height of Rectange : "+rectangle.getHeight());
        System.out.println("Height of Rectange : "+rectangle.getHeight());

        Square sq = new Square(rectangle);

        sq.setSize(5);

        System.out.println("Height of Square : "+sq.getHeight());
        System.out.println("Width of Square : "+sq.getWidth());

        System.out.println(rectangle);

        System.out.println(sq);


    }
}
