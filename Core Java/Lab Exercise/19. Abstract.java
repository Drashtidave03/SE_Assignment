abstract class Shape {
    abstract void draw();

    void displayType() {
        System.out.println("Object Type: Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.displayType();
        s.draw();
    }
}
