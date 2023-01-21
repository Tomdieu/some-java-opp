package com.Geometry;

public class Main {
    public static void main(String[] args) {
        System.out.println("=============CIRCLE=============");
        Circle circle = new Circle(4);
        System.out.println("Area of Circle : "+circle.area());
        System.out.println("Perimeter of circle : "+circle.perimeter());

        System.out.println("=============SQUARE=============");
        Square square = new Square(4);
        System.out.println("Area of square : "+square.area());
        System.out.println("Perimeter of square : "+square.perimeter());

        System.out.println("=============Rectangle=============");
        Rectangle rectangle = new Rectangle(4,4);
        System.out.println("Area of rectangle : "+rectangle.area());
        System.out.println("Perimeter of rectangle : "+rectangle.perimeter());


        Geometry gmt = new Geometry(rectangle);

        System.out.println("The area of the geometry : "+gmt.area());

    }
}
