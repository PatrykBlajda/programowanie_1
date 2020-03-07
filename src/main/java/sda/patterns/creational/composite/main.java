package sda.patterns.creational.composite;

public class main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        System.out.println("==============");
        Shape triangle = new Triangle();
        Drawing drawing1 = new Drawing();
        drawing1.addShape(triangle);
        drawing1.addShape(circle);
        drawing1.draw();
        System.out.println("=============");

    }
}
