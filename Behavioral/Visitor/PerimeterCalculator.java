package Visitor;

public class PerimeterCalculator implements Visitor {
    private double totalPerimeter = 0;

    @Override
    public void visit(Circle circle) {
        double perimeter = 2 * Math.PI * circle.getRadius();
        System.out.println("Circle perimeter: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    @Override
    public void visit(Rectangle rectangle) {
        double perimeter = 2 * (rectangle.getWidth() + rectangle.getHeight());
        System.out.println("Rectangle perimeter: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    @Override
    public void visit(Triangle triangle) {
        // Assuming right triangle for simplicity
        double hypotenuse = Math.sqrt(triangle.getBase() * triangle.getBase() + 
                                    triangle.getHeight() * triangle.getHeight());
        double perimeter = triangle.getBase() + triangle.getHeight() + hypotenuse;
        System.out.println("Triangle perimeter: " + String.format("%.2f", perimeter));
        totalPerimeter += perimeter;
    }

    public double getTotalPerimeter() {
        return totalPerimeter;
    }
}