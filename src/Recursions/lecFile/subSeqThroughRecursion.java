package Recursions.lecFile;

import java.util.ArrayList;

public class subSeqThroughRecursion {
    public static void main(String[] args) {
        String str = "babccad";
        String str1 = "abnkdsApplejsc";
        String newStr = skipCharacter(str);
        System.out.println(newStr);
        String newStr1 = skipString(str1);
        System.out.println(newStr1);
        subSequence("", "abc");
        System.out.println(" ");
        System.out.println(subSeqArrayList("", "abc"));
        subSeqAscii("","abc");
        System.out.println(" ");
        System.out.println(subSeqAsciiALt("","abc"));

    }

    static String skipCharacter(String str) {
        if (str.isEmpty()) return "";
        char ch = str.charAt(0);
//        index++;

        if (ch == 'a') return skipCharacter(str.substring(1));
        return ch + skipCharacter(str.substring(1));
    }

    static String skipString(String str) {
        if (str.isEmpty()) return "";

        char ch = str.charAt(0);
        if (str.startsWith("Apple")) {
            return skipString(str.substring(5));
        }
        return ch + skipString(str.substring(1));
    }

    static void subSequence(String pro, String actual) {
        if (actual.isEmpty()) {
            System.out.print(pro + " ");
            return;
        }
        char ch = actual.charAt(0);
        subSequence(pro + ch, actual.substring(1));
        subSequence(pro, actual.substring(1));
    }

    static ArrayList<String> subSeqArrayList(String pro, String actual) {
        if (actual.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = actual.charAt(0);
        ArrayList<String> left = subSeqArrayList(pro + ch, actual.substring(1));
        ArrayList<String> right = subSeqArrayList(pro, actual.substring(1));
        left.addAll(right);
        return left;
    }

    static void subSeqAscii(String pro, String actual) {
        if (actual.isEmpty()) {
            System.out.print(pro + " ");
            return;
        }
        char ch = actual.charAt(0);
        subSeqAscii(pro + ch, actual.substring(1));
        subSeqAscii(pro, actual.substring(1));
        subSeqAscii(pro + (ch + 0), actual.substring(1));
    }
    static ArrayList<String> subSeqAsciiALt(String pro, String actual) {
        if (actual.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(pro);
            return list;
        }
        char ch = actual.charAt(0);
        ArrayList<String> left = subSeqAsciiALt(pro + ch, actual.substring(1));
        ArrayList<String> mid = subSeqAsciiALt(pro , actual.substring(1));
        ArrayList<String> right = subSeqAsciiALt(pro+(ch+0), actual.substring(1));
        left.addAll(mid);
        left.addAll(right);
        return left;
    }
}
