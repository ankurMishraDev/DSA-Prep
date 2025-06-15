package Generics.Compare;

import java.util.Arrays;
import java.util.Comparator;

public class main {
    public static void main(String[] args) {
        Student ankur = new Student(7, 98);
        Student ansh = new Student(8, 95);
        Student arun = new Student(6, 91);
        Student atul = new Student(5, 92);
        Student alok = new Student(4, 93);
        Student aman = new Student(9, 94);

        Student[]list = {ankur, ansh, alok, arun, aman, atul};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int)(o1.marks - o2.marks) ;
            }
        });
        System.out.println(Arrays.toString(list));

        if (ankur.compareTo(ansh) < 0){
            System.out.println("Ansh has more marks ");
        }else {
            System.out.println("ankur has more marks");
        }
    }
}
