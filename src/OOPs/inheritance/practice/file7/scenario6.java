package inheritance.practice.file7;

public class scenario6 extends bb{
    public static void main(String[] args) {
        aa a = new bb();
        bb b = new bb();
        b = (bb)a;
        System.out.println("value of x: " + a.x);
        System.out.println("value of y: " + b.y);
        System.out.println("value of z: " + b.z);
        a.method1();
        a.method2();
        b.method3();
    }
}
