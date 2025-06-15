package Polymorphism;

public class main {
    public static void main(String[] args) {
        shapes Shape = new shapes();
        shapes Circle = new circle();
        shapes Square = new square();
        shapes Triangle = new triangle();

        Shape.area();
        Circle.area();
        Square.area();
        Triangle.area();
    }
}
