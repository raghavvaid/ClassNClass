package com.company;

public class Circle {
    private double rad;

    public Circle(){
        rad = 0.0;
    }
    public Circle(double r){
        rad = r;
    }
    public double area(){
        double a = Math.PI*(Math.pow(rad,2));
        return a;
    }

    public double circumference(){
        double c = Math.PI*2*rad;
        return c;
    }
}