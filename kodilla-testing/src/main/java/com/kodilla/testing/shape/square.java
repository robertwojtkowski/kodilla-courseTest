package com.kodilla.testing.shape;

import java.util.Objects;

public class square implements Shape {

    private double a;

    @Override
    public String getShapeName() {

        return "square";
    }

    @Override
    public double getField() {

        return a * a;
    }

    public square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "square{" +
                "a=" + a +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        square square = (square) o;
        return Double.compare(square.a, a) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}




