package Recursions.problems;
// link: https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
public class CountSteps {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));
    }
    public static int numberOfSteps(int num) {
        return reduce(num,0);
    }
    static int reduce(int num,int count){
        if(num==0) return count;
        if((num&1)==0){
            return reduce(num/2,count+1);
        }
        return reduce(num-1,count+1);
    }
}
