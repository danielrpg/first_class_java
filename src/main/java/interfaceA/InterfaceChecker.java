package interfaceA;

interface Drawable {
    void draw();
}

interface Shape {
    String getShape();
}

class Circle implements Drawable, Shape {
    public void draw() {
        System.out.println("Circle!");
    }

    public String getShape() {
        return "Circle !!";
    }
}

public class InterfaceChecker {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
        Shape circle_dos = new Circle();
        circle_dos.getShape();
//        Circle circle_tres = new Circle();
//        circle_tres.getShape();
//        circle_tres.draw();

    }
}