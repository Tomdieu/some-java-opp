package com.activty;


public class Point{

    public double x,y;

    public Point(){
this.x = 0.f;
this.y = 0.f;
    }


    public Point(double x,double y){
        this.x = x;
        this.y = y;
    }

    public Point(Point other){
        this.x = other.x;
        this.y = other.y;
    }

    public void afficher(){
        System.out.println("X : "+this.x+" Y : "+this.y);
    }


    public float distance(Point other){
        return (float)Math.sqrt(Math.pow(this.x - other.x,2) + Math.pow(this.y - other.y,2));
    }

    public void deplacer(float dx,float dy){
        this.x += dx;
        this.y += dy;
    }

}