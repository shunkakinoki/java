import java.util.ArrayList;
import java.util.Scanner;

class Five {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Square());
        for (Shape shape : shapes) {
            shape.Show();
        }
        new Enumerate();
        Enumerate.main();
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

class Enumerate {
    enum Options {
        FIRST, SECOND, THIRD, FOURTH, FIFTH
    }

    String[] options = { "1", "2", "3", "4", "5" };

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter string");
        while (sc.hasNextInt()) {
            int num = sc.nextInt();
            if ((num > 0) && (num < 5)) {
                switch (num) {
                case 1:
                    System.out.println(Options.FIRST);
                    break;
                case 2:
                    System.out.println(Options.SECOND);
                    break;
                case 3:
                    System.out.println(Options.THIRD);
                    break;
                case 4:
                    System.out.println(Options.FOURTH);
                    break;
                case 5:
                    System.out.println(Options.FIFTH);
                    break;
                }
                break;
            }
        }
        sc.close();
    }
}