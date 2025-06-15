package Strings;

import java.util.Arrays;

public class methods_in_Strings {
    public static void main(String[] args) {
        String string = "ANKUR MISHRA";
        System.out.println(Arrays.toString(string.toCharArray()));
        System.out.println(string.hashCode());
        System.out.println(string.toLowerCase());
        System.out.println(string);
        System.out.println(string.indexOf('R'));
        System.out.println(string.length());
        System.out.println(Arrays.toString(string.split(" ")));
    }
}
