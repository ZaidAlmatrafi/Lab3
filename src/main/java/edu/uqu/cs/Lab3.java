package edu.uqu.cs;
/*
 * Lab 3 - OOP - Basic Concepts
 * CS 1312
 */
import java.util.Scanner;

/*
 * Make sure to complete and submit your lab
 */

public class Lab3 {

    /************ Part 1 **************/
    /**
     * Code a new class called shape.
     *
     * Important!!! ****** Put your code in another file called Shape.java ********
     * The class should have TWO public methods:
     *
     * getArea: takes no arguments and returns a double datatpe.
     * For the shape class, this method shall return 0.0.
     *
     * printInfo: takes no arguments and returns nothing. It prints a desciption of the shape.
     * For the shape class, this method shall print "Area: 0.00".
     *
     */


    /************ Part 2 **************/
    /**
     * Update Triangle.java to inherit from Shape.java
     *
     * Override the getArea method to return the area of the triangle.
     *
     */

    /************ Part 3 **************/
    /**
     * Code a method named "calculateTriangleArea" that reads two floating point numbers
     * representing the base and the height of a triangle.
     *
     * The method shall create an object of the Triangle class (refer to Triangle.java) using the input values.
     * The method shall return the area of the triangle using the triangle's method call.
     *
     * Example:
     * Input:
     * 2.0 4.0
     *
     * The method shall return the value: 4.0
     */

    public static double cacluateTriangleArea(){
        Scanner scnr = new Scanner(System.in);
        Triangle calcArea = new Triangle();

        double base = scnr.nextDouble();
        double height = scnr.nextDouble();

        calcArea.setBase(base);
        calcArea.setHeight(height);

        return calcArea.getArea();

    }


    /************ Part 4 **************/
    /**
     * Code a new class called Rectangle that extends Shape.java
     *
     * Important!!! ****** Put your code in another file called Rectangle.java ********
     *
     * The class should have TWO private fields:
     * width: a double datatype
     * length: a double datatype
     *
     * The class should have the following public methods:
     *
     * setWidth: takes a double as an argument and returns nothing. It sets the width field to the given value.
     * getWidth: takes no arguments and returns a double. It returns the value of the width field.
     *
     * setLength: takes a double as an argument and returns nothing. It sets the length field to the given value.
     * getLength: takes no arguments and returns a double. It returns the value of the length field.
     *
     * Override the getArea method to return the area of the rectangle.
     * Override the printInfo method to print the width, length, and area of the rectangle.
     */


    /************ Part 5 **************/
    /**
     * Code a method named "calculateRectangleArea" that reads two floating point numbers
     * representing the width and the legnth of a rectangle.
     *
     * The method shall create an object of the Rectangle class using the input values.
     * The method shall return the area of the Rectangle using the Rectangle's method call.
     *
     * Example:
     * Input:
     * 2.0 4.0
     *
     * The method shall return the value: 8.0
     */
    public static double cacluateRectangleArea(){
        Scanner scnr = new Scanner(System.in);
        Rectangle calcArea = new Rectangle();

        double width = scnr.nextDouble();
        double length = scnr.nextDouble();

        calcArea.setWidth(width);
        calcArea.setLength(length);

        return calcArea.getArea();

    }


    public static void main(String[] args) {

        /* You are not required to write any code here */

    }

}