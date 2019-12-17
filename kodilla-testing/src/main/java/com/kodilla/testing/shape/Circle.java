package com.kodilla.testing.shape;

import java.util.Objects;

public class Circle implements Shape {

    private double a;


    @Override
    public String getShapeName() {

        return "circle";
    }

    @Override
    public double getField() {

        return a*a*Math.PI;
    }


    public Circle(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "a=" + a +
                '}';
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
