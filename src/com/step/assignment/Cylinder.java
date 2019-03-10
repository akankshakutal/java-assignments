package com.step.assignment;


public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if(height < 0) {
            height = 0;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getArea() {
        return (2 * Math.PI * super.getRadius() * this.height) + (2 * super.getArea());
    }

    public double getVolume() {
        return super.getArea() * this.height;
    }
}