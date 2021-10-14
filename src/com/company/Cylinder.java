package com.company;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(double r1, double h1){
        base = new Circle(r1);
        height = h1;
    }

    public double vol(){
        return this.base.area() * this.height;
    }

    public double sa(){
        return (this.base.area()*2) + (this.base.circumference()*this.height);
    }

}
