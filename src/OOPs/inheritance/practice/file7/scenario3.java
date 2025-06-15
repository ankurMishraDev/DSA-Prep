package inheritance.practice.file7;

public class scenario3 extends bb{
    public static void main(String[] args) {
        aa a = new bb();
        System.out.println("value of x: " + a.x);
        System.out.println("value of b: " + a.y);

        a.method1();
        a.method2();
    }
}
