package Arrays.lecFile;

import java.util.Arrays;
import java.util.Scanner;

public class arrayinputs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        input using condition_loops.loops
//        array of primitive
//        int[] arr = new int[5];
//        for (int i = 0; i<arr.length; i++) // this for loop is created to get required inputs from user
//        {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i=0; i< arr.length; i++){//this for loop is created to print all the array element
//            System.out.println(arr[i]);
//        for (int j : arr){// for element in array print the element
//            System.out.println(j + " ");// here j represents elements of the array
//        }

//        array of object
String [] str = new String[4];
for (int i = 0; i< str.length; i++){
    str[i]= in.next();
}
        System.out.println(Arrays.toString(str));
//modify
str[1] = "ankur";
        System.out.println(Arrays.toString(str));

    }
}
