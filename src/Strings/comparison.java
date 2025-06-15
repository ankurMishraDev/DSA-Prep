package Strings;

public class comparison {
    public static void main(String[] args) {
        String a = "ankur";
        String b = "ankur";

//        comparison of object value of both the strings 'a' and 'b'
         System.out.println("Is string (a) and (b) are pointing towards same object value ");
        System.out.println(a == b);

        String name1 = new String("rahul");
        String name2 = new String("rahul");

//        comparison of object value of both the strings 'name1' and 'name2'
        System.out.println("Is string (name1) and (name2) are pointing towards same object value ");
        System.out.println(name1 == name2);

//        comparison of value of both the strings 'name1' and 'name2'
        System.out.println("Is string (name1) and (name2) are having same value ");
        System.out.println(name1.equals(name2));

//        System.out.println(name1.charAt(0));
    }
}
