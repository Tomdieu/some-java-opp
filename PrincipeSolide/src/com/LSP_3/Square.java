package com.LSP_3;

public class Square extends Rectangle{

    private Rectangle rectangle;

    public Square (Rectangle rectangle){
        this.rectangle = rectangle;
    }


    public void setSize(int size){
        this.setHeight(size);
        this.setWidth(size);
    }

    @Override
    public String toString() {
        return "Square [rectangle=" + rectangle + "]";
    }


    public Rectangle getRectangle() {
        return rectangle;
    }

    public void setRectangle(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    
}