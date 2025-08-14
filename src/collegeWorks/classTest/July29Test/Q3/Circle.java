package collegeWorks.classTest.July29Test.Q3;

import java.util.Scanner;

public class Circle extends Shape{
    @Override
    void area(int rad){
        float area = ((float) 22 /7)*rad*rad;
        System.out.println("Area of Circle is: "+ area);
    }

    @Override
    void area(int l, int b) {

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle obj = new Circle();
        System.out.println("Enter the radius of circle: ");
        int rad = sc.nextInt();
        obj.area(rad);
    }
}
