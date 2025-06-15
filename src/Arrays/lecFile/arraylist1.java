package Arrays.lecFile;

import java.util.Scanner;
import java.util.ArrayList;
public class arraylist1 {
    public static void main(String[] args) {
//        System.out.println("enter the elements you want to store in array. Ahh you fool their is no need to define no. of elements to use in Arraylist");

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>(n);//Syntax
//        followings : how to add an element in the Intro_array_12_dsa_kunal.arraylist
        list.add(74);
        list.add(534);
        list.add(34);
        list.add(34);
        list.add(5489);
        list.add(5444);
        list.add(541);
        System.out.println(list);
//       following: finding an element int the Intro_array_12_dsa_kunal.arraylist. if yes then it gives true otherwise false
        System.out.println("does this array contains element(8)");
        System.out.println(list.contains(8));
//        following: how to change an element using his index no.
        System.out.println("Change an element at index no.4");
        list.set(4, 7854);
        System.out.println(list);

//        following : how to remove an element using his index no.
        System.out.println("Removing an element from index no. 6");
        list.remove(6);
        System.out.println(list);
//       following : how to insert element using for loop
//to use this block of code first customized above list elements or just make them comments
        for (int i = 0; i<5; i++){
            list.add(in.nextInt());
        }
        for (int i = 0; i<5 ; i++){
            System.out.println(list.get(i));//pass index here, list[index] syntax will not work here
        }







    }
}
