package com.Geometry;

public class Rectangle extends Shape{
    private float length;
    private float width;

    public Rectangle() {
    }
    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }
    public float getLength() {
        return length;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public float getWidth() {
        return width;
    }
    public void setWidth(float width) {
        this.width = width;
    }
    public float area(){
        return this.width * this.length;
    }
    public float perimeter(){
        return 2*(this.length) + 2*(this.width);
    }
}
