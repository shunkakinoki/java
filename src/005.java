import java.util.ArrayList;

class Five {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        for (Shape shape : shapes) {
            shape.Show();
        }
    }
}

interface Shape {
    abstract public void Show();
}

class Circle implements Shape {
    @Override
    public void Show() {
        System.out.println("Zero");
    }
}

class Triangle implements Shape {
    @Override
    public void Show() {
        System.out.println("Three");
    }
}

class Square implements Shape {
    @Override
    public void Show() {
        System.out.println("Four");
    }
}

