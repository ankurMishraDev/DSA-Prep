package Interface_Classes.extendDemo;


public class main implements B {
    @Override
    public void greet() {
        System.out.println("have a good day");
    }

    @Override
    public void fun() {
        System.out.println("have fun");
    }

    public static void main(String[] args) {
        main obj = new main();
        obj.greet();
        obj.fun();
    }
}
