package Abstract_Classes.practice.file2;

public class square extends shape{
    @Override
    void area() {
        System.out.println("Area of Square: side x side");

    }

    @Override
    void perimeter() {
        System.out.println("Perimeter of square: sum of four sides");
    }
}
