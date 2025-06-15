package inheritance.practice.file3;

public class test extends Q{
    public static void main(String[] args) {
        Q obj = new Q();
        System.out.println("The value of instance variable a in class A: " + obj.a);
        P obj1 = new P();
        System.out.println("The value of instance variable a in class B: " + obj1.a);
    }
}
