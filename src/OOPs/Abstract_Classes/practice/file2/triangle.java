package Abstract_Classes.practice.file2;

public class triangle extends shape{
    @Override
    void area() {
        System.out.println("Area of triangle: 1/2 x base x height");
    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of triangle: sum of its three sides");
    }
}
