package ploy_task;

// Q5. You are building a shape manipulation application. There are different types of shapes,
// such as circles, squares, and triangles. Each shape has its own resizing and rotation methods.
// Implement a Java program using polymorphism to manipulate and transform different shapes.

abstract class ManipulatableShape {
    abstract void resize();
    abstract void rotate();
}

class CircleManip extends ManipulatableShape {
    void resize() {
        System.out.println("Resizing circle...");
    }

    void rotate() {
        System.out.println("Rotating circle...");
    }
}

class SquareManip extends ManipulatableShape {
    void resize() {
        System.out.println("Resizing square...");
    }

    void rotate() {
        System.out.println("Rotating square...");
    }
}

class TriangleManip extends ManipulatableShape {
    void resize() {
        System.out.println("Resizing triangle...");
    }

    void rotate() {
        System.out.println("Rotating triangle...");
    }
}

public class q5 {
    public static void main(String[] args) {
        ManipulatableShape shape1 = new CircleManip();
        ManipulatableShape shape2 = new SquareManip();
        ManipulatableShape shape3 = new TriangleManip();

        shape1.resize();
        shape1.rotate();

        shape2.resize();
        shape2.rotate();

        shape3.resize();
        shape3.rotate();
    }
}

