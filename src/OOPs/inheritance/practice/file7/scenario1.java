package inheritance.practice.file7;

public class scenario1 extends bb{
    public static void main(String[] args) {
        aa a = new aa();
        System.out.println("valur of x: " + a.x);
        System.out.println("value of y: " + a.y);

        a.method1();
        a.method2();
    }
    public static void method(){
        System.out.println("method from scenario1 class");
    }
}
