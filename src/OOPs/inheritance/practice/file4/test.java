package inheritance.practice.file4;

public class test extends childClass {
    public static void main(String[] args) {
        childClass obj = new childClass();
        obj.method();
        obj.method2();
        System.out.println("value of x; " + obj.x);

        baseClass obj1 = new baseClass();
        obj1.method();
        System.out.println("value of x: " + obj1.x);
    }
}
