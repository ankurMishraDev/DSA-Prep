package Strings;

public class SB {
    public static void main(String[] args) {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+ i);
            string.append(ch);
            /* during this loop execution by every iteration the value gets changed, and we know that StringBuilder
            overcome the immutable limitation of Strings hence there is no new object has been created for the object
            value after every iteration.
             */
        }
        System.out.println(string.toString());
        string.reverse();
        System.out.println(string.toString());
    }
}
