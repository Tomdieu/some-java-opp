package com.Geometry;

public class Geometry {
    private Shape shape;

    public Geometry(Shape shape) {
        this.shape = shape;
    }
    
    public float area(){
        return this.shape.area();
    }

    public float perimeter(){
        return this.shape.perimeter();
    }
}
