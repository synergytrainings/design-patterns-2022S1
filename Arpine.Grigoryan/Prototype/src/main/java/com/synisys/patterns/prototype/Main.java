package com.synisys.patterns.prototype;

import com.synisys.patterns.prototype.impl.Circle;
import com.synisys.patterns.prototype.impl.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.setArea(10);
        circle.setRadius( 15);
        circle.setColor("red");
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Triangle triangle = new Triangle();
        triangle.setArea(100);
        triangle.setColor("blue");
        triangle.setAltitudes(10);
        shapes.add(triangle);

        Triangle anotherTriangle = (Triangle) triangle.clone();
        shapes.add(anotherTriangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(String.format(" Shapes with index %s are different objects" , i));
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(String.format(" Shapes with index %s are equals" , i));
                } else {
                    System.out.println(String.format(" Shapes with index %s are not equals" , i));
                }
            } else {
                System.out.println(String.format(" Shapes with index %s are same" , i));
            }
        }
    }
}
