package Cloning;

import java.util.Arrays;

public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        human ankur = new human(20,"ankur mishra");
//        human twin = new human(ankur);
        human twin = (human)ankur.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));
        twin.arr[0]=98;
        System.out.println(Arrays.toString(twin.arr ));
        System.out.println(Arrays.toString(ankur.arr));

        System.out.println( );
    }
}
