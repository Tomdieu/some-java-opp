package com.Geometry;

public class Circle extends Shape{
    private float raduis;

    public Circle() {
    }
    
    public Circle(float raduis) {
        this.raduis = raduis;
    }

    public float area(){
        return (float)(2 * Math.PI * raduis * raduis);
    }
    public float perimeter(){
        return (float)(2* Math.PI*raduis);
    }
    public float getRaduis() {
        return raduis;
    }
    public void setRaduis(float raduis) {
        this.raduis = raduis;
    }


}
