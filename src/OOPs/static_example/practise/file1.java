package static_example.practise;

import java.util.Arrays;

public class file1 {
    static int a = 70;
    static int b ;
    static int times;
    static {
        System.out.println("static block execution completed");
        b = a*9;
        times += 0;
        }

    public static void main(String[] args) {
        file1 obj = new file1();
        System.out.println(Arrays.asList(obj.a , obj.b));

        file1.b += 4;
        System.out.println(Arrays.asList(obj.a , obj.b));

        file1 obj2 = new file1();
        System.out.println(Arrays.asList(obj2.a , obj2.b));

        file1.b += 4;
        System.out.println(Arrays.asList(obj2.a , obj2.b));
        System.out.println(times);
        //doesn't matter how many times you create object of same class. The static block will only execute when the
//        first object has been created
        file1 obj3 = new file1();
        file1 obj4 = new file1();
        file1 obj5 = new file1();
    }
}
