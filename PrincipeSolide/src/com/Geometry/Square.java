package com.Geometry;

public class Square extends Shape{
   private float length;

   

public Square(float length) {
    this.length = length;
}

public float getLength() {
    return length;
}

public void setLength(float length) {
    this.length = length;
}

public float area(){
    return length * length;
}

public float perimeter(){
    return length * 4;
}
   

}
