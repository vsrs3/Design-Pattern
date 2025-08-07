package Visitor;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Rectangle(4.0, 6.0));
        shapes.add(new Triangle(3.0, 4.0));

        System.out.println("Calculating areas:");
        AreaCalculator areaCalculator = new AreaCalculator();
        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
        System.out.println("Total area: " + String.format("%.2f", areaCalculator.getTotalArea()));

        System.out.println("\nCalculating perimeters:");
        PerimeterCalculator perimeterCalculator = new PerimeterCalculator();
        for (Shape shape : shapes) {
            shape.accept(perimeterCalculator);
        }
        System.out.println("Total perimeter: " + String.format("%.2f", perimeterCalculator.getTotalPerimeter()));
    }
}