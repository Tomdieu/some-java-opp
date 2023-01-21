package com.activty;


class TestPoint{
    public static void main(String[] args){
        System.out.println("TestPoint");
        Point p1 = new Point(1,2.0);
        Point p2 = new Point();
        Point p3 = new Point(5.7,3.9);

        float d = p1.distance(p3);
        System.out.println("Distance between p1 and p3 : "+d);
        p1.afficher();
        p2.afficher();
        p3.afficher();
        System.out.println("Distance between p1 and p2 : "+p1.distance(p2));
    }  
}
