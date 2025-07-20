package Recursions.lecFile;

public class Palindrome {
    public static void main(String[] args) {
        String str = "oppo";
        String str2 = "ankur";
        System.out.println(str2 + " is a palindrome?: "+ palindrome(str2,0,str.length()-1));
    }
    static boolean palindrome(String str, int s, int e){
        if(s>e) return true;
        if(str.charAt(s)==str.charAt(e)){
            palindrome(str,++s,--e);
        }else return false;
        return true;
    }
}
