package collegeWorks.classTest.July29Test.Q3;

public class Rectangle extends Shape{


    @Override
    void area(int rad) {

    }

    @Override
    void area(int l, int b){
        System.out.println("Area of Rectangle is: " + (l*b));
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        rec.area(5,4);
    }
}
