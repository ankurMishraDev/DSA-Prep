package Heaps_and_Hashmap;

public class KarpRabinAlgo {
    private final int PRIME = 167;
    // calculate hash function
//    You’re computing a polynomial hash with base PRIME = 167:
//    So the first character is multiplied by 167^0, the second by 167^1, etc. Concretely, for "abc" (using Java char codes 'a'=97, 'b'=98, 'c'=99):
//    start: hash = 0
//    i = 0 → add 97 * 167^0 = 97 * 1 = 97 → hash = 97
//    i = 1 → add 98 * 167^1 = 98 * 167 = 16366 → hash = 16463
//    i = 2 → add 99 * 167^2 = 99 * 27889 = 276,? (≈ 2,760,? exact: 2,760,? ) → accumulate
    private double calcHash(String str){
        double hash = 0;
        for (int i = 0; i < str.length() ; i++) {
            hash = hash+str.charAt(i)*Math.pow(PRIME,i);
        }
        return hash;
    }

    // update hash function
//    Step-by-step breakdown of your formula
//    Step 1: Remove the old char and shift powers down
//            (prevHash - oldChar) / PRIME
//
//
//    prevHash - oldChar removes the power-0 term for the outgoing character (oldChar was multiplied by PRIME^0 = 1)
//
//    Dividing by PRIME effectively reduces the power of every remaining character by 1
//    Example:
//
//    H = a*B^0 + b*B^1 + c*B^2
//    Remove a: H - a = b*B^1 + c*B^2
//    Divide by B: (H-a)/B = b*B^0 + c*B^1
//
//    Step 2: Add the new char at the highest power
//+ newChar * Math.pow(PRIME, strLength - 1)
//
//
//    The new char is placed at position m-1 in the window, so it gets multiplied by PRIME^(m-1)
//    This restores the correct position-based power assignment
    private double updateHash(double prevHash, char oldChar, char newChar, int strLength){
        double newHash = (double) (prevHash - oldChar) /PRIME;
        newHash = newHash + newChar*Math.pow(PRIME,strLength-1);
        return newHash;
    }

    // substring search function

    public void search(String text, String subStr){
        int subStrLen = subStr.length();
        double subStrHash = calcHash(subStr);
        double textHash = calcHash(text.substring(0,subStrLen));
        for (int i = 0; i < text.length()-subStrLen ; i++) {
            if (textHash==subStrHash){
                if (text.substring(i,i+subStrLen).equals(subStr)){
                    System.out.println("Pattern found at index: "+ i);
                }
            }
            if(i<text.length()-subStrLen){
                textHash = updateHash(textHash,text.charAt(i),text.charAt(i+subStrLen),subStrLen);
            }
        }

    }

    public static void main(String[] args) {
        String a = "ankur";
        String b = "jodsnohdfkscjsankur2329@#(*@#&@#*&$";
        KarpRabinAlgo algo = new KarpRabinAlgo();
        algo.search(b,a);
    }
}
