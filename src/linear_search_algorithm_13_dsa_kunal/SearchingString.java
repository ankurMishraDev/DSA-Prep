package linear_search_algorithm_13_dsa_kunal;//import java.util.Scanner;

import java.util.Arrays;

public class SearchingString {
    public static void main(String[] args) {

        String name = "Organisation";
        char target = 'z';
//        System.out.println(search(name, target));//to print whether  the required element is present in the String or not
        System.out.println(Arrays.toString(name.toCharArray()));// to print the string name is structured array format
    }

    static boolean search(String str, char target) {//this function block is used to store the string name in a structured array format
        if (str.length() == 0) {//here the str.length is a function whereas general arr.length is variable
            return false;
        }
        for (char i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
return false;
    }

    static boolean search2(String str, char target) {//this code block is used to search a particular element in string data type variable
        if (str.length() == 0) {
            return false;
        }
        for (char h : str.toCharArray()) {
            if( h == target){
                return true;
            }
        }
        return false;
    }
}