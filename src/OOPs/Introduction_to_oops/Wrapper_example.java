package Introduction_to_oops;

import java.nio.channels.WritableByteChannel;
import java.sql.Wrapper;

public class Wrapper_example {
    public static void main(String[] args) {
        int a = 84;
        int b = 88;
//        System.out.println(a + " " +b);

        swap(a,b);
//        System.out.println(a );
//        always initialize final variable before declaring
final A ankur = new A("ankur mishra");
//when a non primitive is final, you cannot reassign it.
//ankur.name = "other name";
        System.out.println(ankur.name);
        A obj = new A("siuu");
        obj.name = "ankur";
//        for (int i = 0; i < 100000; i++) {
//            obj = new A("Random Name");
      System.out.println(obj.name);
        ankur.name = "greninja";
        System.out.println(ankur.name);
    }
    static void swap(int a , int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);
    }
}

class A {
    int num = 10;
    String name;
    public A(String name) {
        this.name = name;
    }


}
