package Recursions.lecFile;

import Strings.Output;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        permutations("", "abc");
        System.out.println(" ");
        ArrayList<String> list = permutationList("", "abc");
        System.out.println(list);
        System.out.println(count("", "abcdef"));
    }
    static void permutations(String pro, String actual){
        if(actual.isEmpty()){
            System.out.print(pro+" ");
            return;
        }
        char ch = actual.charAt(0);
        for (int i = 0; i <= pro.length() ; i++) {
            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            permutations(f+ch+s, actual.substring(1));
        }
    }
    static ArrayList<String> permutationList(String pro,String actual){
        if(actual.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = actual.charAt(0);
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i <= pro.length() ; i++) {
            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            ArrayList<String> ans = permutationList(f+ch+s, actual.substring(1));
            list.addAll(ans);
        }

        return list;
    }
    static int count(String pro, String actual){
        if(actual.isEmpty()){

            return 1;
        }
        char ch = actual.charAt(0);
        int count = 0;
        for (int i = 0; i <= pro.length() ; i++) {
            String f = pro.substring(0,i);
            String s = pro.substring(i,pro.length());
            count = count + count(f+ch+s, actual.substring(1));
        }
        return count;
    }
}
