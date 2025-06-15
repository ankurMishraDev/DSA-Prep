package inheritance.practice.file7;

public class scenario4 extends bb {
    public static void main(String[] args) {
        aa a = new aa();
        bb b = new bb();
        a = b;
        System.out.println("valur of x: " + a.x);
        System.out.println("value of y: " + a.y);
        a.method1();
        a.method2();
    }
}
