package Introduction_to_oops;

import java.util.ArrayList;
import java.util.Arrays;

public class classes {
    public static void main(String[] args) {
//        store 5 roll no.
        int[] numbers = new int[5];
        numbers[0] = 23;
        numbers[1]= 24;
        numbers[2]= 37;
        numbers[3]= 38;
        numbers[4]= 58;
        System.out.println(Arrays.toString(numbers));
//        store 5 names
        String[] names = new String[5];
//    data of 5 students{roll no., name, marks
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];
          class student {
             int rno;
             float marks;
            String name;
//we nedd a way to add the values of the above properties object by object
            public student(int rno, float marks, String name){
                this.name = name;
                this.marks = marks;
                this.rno = rno;
            }
        }
student ank = new student(420,0,"golu");
        System.out.println(ank.name);
        student ankur = new student(4, 98, "ankur");
        System.out.println(ankur.rno + " " + ankur.marks + " " + ankur.name) ;


        student ansh = new student(7,84, "ansh mishra");
        System.out.println(ansh.rno +" "+  ansh.marks +  " "+ ansh.name);


        student arpit = new student(10, 15, "arpit");
        System.out.println(arpit.rno + " " + arpit.marks + " " + arpit.name);



        student one = new student(10, 15, "arpit");
        student two = one;
        System.out.println(two.name);
         one.name = " hello";
        System.out.println(two.name);












    }}
