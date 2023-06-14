package edu.uqu.cs;

import edu.uqu.cs.Shape;

public class Rectangle extends Shape{


    private double width = 0.0 ;
    private double length = 0.0 ;

    public void setWidth ( double userWidth){
        width = userWidth;
    }

    public double getWidth(){
        return width;
    }

    public void setLength( double userLength){
        length = userLength;
    }

    public double getLength(){
        return length;
    }

    public double getArea(){
        double area = width * length;
        return area;
    }

    public void printInfo(){

        System.out.printf("Length: %.2f%n" , length);
        System.out.printf("width: %.2f%n" , width);
        System.out.printf("Area: %.2f%n" , getArea());
    }
}