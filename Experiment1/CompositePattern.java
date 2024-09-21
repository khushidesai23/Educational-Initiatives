// Component

import java.util.ArrayList;
import java.util.List;

interface Shape {
    void draw();
}

// Leaf
class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

// Composite
class CompositeShape implements Shape {
    private List<Shape> shapes = new ArrayList<>();

    public void add(Shape shape) {
        shapes.add(shape);
    }

    public void draw() {
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}
