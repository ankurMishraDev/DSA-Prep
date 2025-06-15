package Arrays.lecFile;
//import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the no elements of Intro_array_12_dsa_kunal.arrays");
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);
        list.add(62542);
        list.add(98262);
        list.add(96412);
        list.add(53461352);
        list.add(7896126);
        list.add(51532);
        list.add(71154);
        list.add(21346);
        list.add(64163);
        System.out.println(list);
        System.out.println(list.contains(51532));
        list.set(0,  99);
        System.out.println(list);
        System.out.println(list.contains(9999999));
        list.remove(2);
        System.out.println(list);
        list.add(2,84513);
        System.out.println(list);
        System.out.println(list);
//        for (int i = 0; i < 5; i++) {
//            list.add(in.nextInt());
//        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(list.get(i));
//        }
//        System.out.println(list);
    }
}
