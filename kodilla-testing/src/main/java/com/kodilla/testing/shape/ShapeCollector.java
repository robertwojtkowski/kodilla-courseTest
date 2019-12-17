package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> ksztalty = new ArrayList<>();


    public void addFigure(Shape shape){
        ksztalty.add(shape);

    }

    public boolean removeFigure(Shape shape){
        boolean result=false;
        if (ksztalty.contains(shape)){

            ksztalty.remove(shape);
            result=true;
        }

        return result;
    }

    public Shape getFigure(int n) {
        Shape shape = null;

        if (ksztalty.size() > n && n >= 0) {
            shape = ksztalty.get(n);
        }
        return shape;
    }

    public ArrayList<Shape> getShapes() {
        return ksztalty;
    }

}
