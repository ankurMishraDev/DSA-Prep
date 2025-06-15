package inheritance.practice.file7;

public class scenario2 extends bb{
    public static void main(String[] args) {
bb b = new bb();
        System.out.println("value of x: " + b.x);
        System.out.println("valur of y: " + b.y);
        System.out.println("value of z: " + b.z);

        b.method1();
        b.method2();
        b.method3();
    }
}
